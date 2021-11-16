package main;

//import Screens.RegisterScreen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Easier App. Place, where your college life gets easier. " +
                            "We are here to help you. Whenever, Wherever.");
        System.out.println("Please sign in or register into your account!");
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        //RegisterScreen register = new RegisterScreen();//BufferedReader consoleReader, ScreenRouter router, UserService userService);
        String choice1 = "1) Enter bank account";
        String choice2 = "2) Register for classes or check registration status";


        System.out.println("Please Choose option 1:\n" + choice1);// + "\n" + choice2);

        Scanner scan = new Scanner(System.in);
        boolean decision = scan.hasNext();
        if (scan.hasNext("1")) {
            System.out.println("You picked " + choice1);
            Bank bank = new Bank();
        }else if (scan.hasNext("2")) {
            System.out.println("You picked " + choice2);
            //Bank bank = new Bank();
        }

    }

}