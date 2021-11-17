package userService;


import com.revature.vasili_nashvilli_p0_assignment.exceptions.InvalidRequestException;
import com.revature.vasili_nashvilli_p0_assignment.main.Bank;
import com.revature.vasili_nashvilli_p0_assignment.userService.ResourcePersistenceException;
import main.BankUser;
import com.revature.vasili_nashvilli_p0_assignment.exceptions.ResourcePersistenceException;

public class UserService {

    private final BankUser userDAO ;
    private BankUser sessionUser;

    public UserService(BankUser userDAO) {
        this.userDAO = userDAO;
        this.sessionUser = null;
    }

    public BankUser getSessionUser() {
        return sessionUser;
    }

    public boolean registerNewUser(BankUser newUser) {

        if (!isUserValid(newUser)) {
            throw new InvalidRequestException("Invalid user data provided!");
        }

        boolean usernameAvailable = userDAO.findUserByUsername(newUser.getUsername()) == null;
        boolean emailAvailable = userDAO.findUserByEmail(newUser.getEmail()) == null;

        if (!usernameAvailable || !emailAvailable) {
//            if (!usernameAvailable && emailAvailable) {
//                throw new ResourcePersistenceException("The provided username was already taken in the datasource!");
//            } else if (usernameAvailable) {
//                throw new ResourcePersistenceException("The provided email was already taken in the datasource!");
//            } else {
//                throw new ResourcePersistenceException("The provided username and email was already taken in the datasource!");
//            }
            String msg = "The values provided for the following fields are already taken by other users:";
            if (!usernameAvailable) msg = msg + "\n\t- username";
            if (!emailAvailable) msg = msg + "\n\t- email";
            throw new ResourcePersistenceException(msg);
        }

        BankUser registeredUser = userDAO.save(newUser);

        if (registeredUser == null) {
            throw new exceptions.ResourcePersistenceException("The user could not be persisted to the datasource!");
        }

        return true;

    }

    public void authenticateUser(String username, String password) {

        if (username == null || username.trim().equals("") || password == null || password.trim().equals("")) {
            throw new InvalidRequestException("Invalid credential values provided!");
        }

        BankUser authenticatedUser = userDAO.findUserByUsernameAndPassword(username, password);

        if (authenticatedUser == null) {
            throw new AuthenticationException();
        }

        sessionUser = authenticatedUser;

    }

    public void logout() {
        sessionUser = null;
    }

    public boolean isSessionActive() {
        return sessionUser != null;
    }

    public boolean isUserValid(BankUser user) {
        if (user == null) return false;
        if (user.getFirstName() == null || user.getFirstName().trim().equals("")) return false;
        if (user.getLastName() == null || user.getLastName().trim().equals("")) return false;
        if (user.getEmail() == null || user.getEmail().trim().equals("")) return false;
        if (user.getUsername() == null || user.getUsername().trim().equals("")) return false;
        return user.getPassword() != null && !user.getPassword().trim().equals("");
    }

}