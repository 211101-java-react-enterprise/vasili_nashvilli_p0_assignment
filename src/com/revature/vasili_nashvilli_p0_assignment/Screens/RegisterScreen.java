package com.revature.vasili_nashvilli_p0_assignment.Screens;
import com.revature.vasili_nashvilli_p0_assignment.userService;
import com.revature.vasili_nashvilli_p0_assignment.Screens.ScreenRouter;
import main.BankUser;

import java.io.BufferedReader;

public class RegisterScreen extends Screens.Screen {

    private final userService.UserService userService;

    public RegisterScreen(BufferedReader consoleReader, Screens.ScreenRouter router, userService.UserService userService) {
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

        BankUser newUser = new BankUser(firstName, lastName, email, username, password);

        boolean registerSuccessful = userService.registerNewUser(newUser);

        if (registerSuccessful) {
            // router.navigate("/dashboard");
        } else {
            System.out.println("You have provided invalid data. Please try again.");
        }


    }

}

}