package Screens;
/*
import com.revature.quizzard.exceptions.InvalidRequestException;
import com.revature.quizzard.exceptions.ResourcePersistenceException;
import com.revature.quizzard.models.AppUser;
import com.revature.quizzard.services.UserService;
import com.revature.quizzard.util.ScreenRouter;

public class RegisterScreen extends Screen {

    public void register() throws Exception {
        System.out.println("The user selected Register");
        System.out.println("Please provide us with some basic information.");
        System.out.print("First name: ");
        String firstName = consoleReader.readLine();

        System.out.print("Last name: ");
        String lastName = consoleReader.readLine();

        System.out.print("Email: ");
        String email = consoleReader.readLine();

        System.out.print("Username: ");
        String username = consoleReader.readLine();

        System.out.print("Password: ");
        String password = consoleReader.readLine();

        System.out.printf("Provided user first and last name: { \"firstName\": %s, \"lastName\": %s}\n", firstName, lastName);
        // String format specifiers: %s (strings), %d (whole numbers), %f (decimal values)

        AppUser newUser = new AppUser(firstName, lastName, email, username, password);
    }

    @Override
    public void render() throws Exception {

    }
}
        /*
        System.out.println();
        System.out.println("Registration Page");
        System.out.println("NOTE: your username is a unique one so it cannot be changed.");
        System.out.printf("Username: ");
        String user = input.next();
        System.out.printf("Password: ");
        String pass = input.next();
        System.out.printf("Confirm Password: ");
        String conf = input.next();
        int length = pass.length();
        int passInt = Integer.parseInt(pass);
        int confInt = Integer.parseInt(conf);
        File file = new File("C:"+File.separator + "Users"+File.separator + "فاطمة"+File.separator + "Downloads"+File.separator + "accounts.txt");

        if (length < 6) {
            System.out.println("Too short password, password must be 6 characters or more");
        } else {
            if (passInt == confInt) {

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String current;
                    boolean checkname = false;
                    while ((current = br.readLine()) != null) {
                        if(current.equalsIgnoreCase(user)){
                            checkname = true;
                        }
                    }
                    if (checkname) {
                        System.out.println("Username is already exists and used, please type another one");
                    } else {
                        Formatter x = null;
                        try {
                            FileWriter f = new FileWriter(file.getAbsoluteFile());
                            BufferedWriter bw = new BufferedWriter(f);
                            bw.write(user);
                            bw.close();
                            x = new Formatter(f);
                            x.format("%s %s%n", user.toUpperCase(), pass);
                            System.out.println("You registered succesfully");
                            x.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                catch (Exception e) {
                }
            } else {
                System.out.println("Password and confirm password are not matching");
            }
        }

    public RegisterScreen(String name, String route, BufferedReader consoleReader, ScreenRouter router) {
        super(name, route, consoleReader, router);
    }

    @Override
    public void render() throws Exception {

    }
}

    /*private final UserService userService;

    public RegisterScreen(BufferedReader consoleReader, ScreenRouter router, UserService userService) {
        super("RegisterScreen", "/register", consoleReader, router);
        this.userService = userService;
    }


    @Override
    public void render() throws Exception {
        System.out.println("The user selected Register");
        System.out.println("Please provide us with some basic information.");
        System.out.print("First name: ");
        String firstName = consoleReader.readLine();

        System.out.print("Last name: ");
        String lastName = consoleReader.readLine();

        System.out.print("Email: ");
        String email = consoleReader.readLine();

        System.out.print("Username: ");
        String username = consoleReader.readLine();

        System.out.print("Password: ");
        String password = consoleReader.readLine();

        System.out.printf("Provided user first and last name: { \"firstName\": %s, \"lastName\": %s}\n", firstName, lastName);
        // String format specifiers: %s (strings), %d (whole numbers), %f (decimal values)

        AppUser newUser = new AppUser(firstName, lastName, email, username, password);

        /*
        try {
            userService.registerNewUser(newUser);
            System.out.println("Registration successful!");
            router.navigate("/login");
        } catch (InvalidRequestException | ResourcePersistenceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // TODO log this unexpected exception to a file
            e.printStackTrace();
        }


    }

}
*/