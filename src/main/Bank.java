package main;
import java.io.*;
import java.util.Scanner;

public class Bank {

    static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
    public Bank() {
        System.out.println("Welcome to The Bank of World");
        boolean isOn = true;
        while(isOn){

            System.out.println("What would you like to do? \n" +
                    "1) Register a new account\n"+
                    "2) Login\n"+
                    "3) Deposit\n" +
                    "4) Withdraw\n" +
                    "5) Check balance\n"+
                    "6) Exit");
            try {
                //Scanner scan = new Scanner(System.in);
                String choice = consoleReader.readLine();

                switch (choice) {
                    case "1":
                        register(consoleReader);
                        break;
                    case "2":
                        login(consoleReader);
                        break;
                    case "3":
                        deposit(consoleReader);
                        break;
                    case "4":
                        withdraw(consoleReader);
                        break;
                    case "5":
                        check_balance(consoleReader);
                    case "6":
                        System.out.println("Thank you for the visit. We appreciate your business!");
                        isOn = false;
                        break;
                    default:
                        System.out.println("Wrong selection. Please pick a number from the Menu");
                }

            } catch (Exception ioe) {
                ioe.printStackTrace();
            }
        }
    }

    private void login(BufferedReader consoleReader) throws IOException {
        System.out.println("The user selected Login");
        System.out.println("please provide your login details");
        String username = consoleReader.readLine();
        System.out.println("username: "+username);
        String Password = consoleReader.readLine();
        System.out.println("password: "+Password);
        //if(username && Password){

        //}

    }

    private void register(BufferedReader consoleReader) throws IOException {
        System.out.println("The user selected register");
        System.out.println("Please provide us with some basic information");
        System.out.println("First name ");
        String firstName = consoleReader.readLine();
        System.out.println("Last Name: ");
        String lastName = consoleReader.readLine();
        System.out.println("User Name: ");
        String userName = consoleReader.readLine();
        System.out.println("Email: ");
        String Email = consoleReader.readLine();
        System.out.println("Password: ");
        String Password = consoleReader.readLine();
        System.out.printf("The provided user information: {\"firstName\": %s, \"lastName\": " +
                "%s, \"userName\": %s, \"Email\": %s. }", firstName, lastName, userName, Email);
        System.out.println();
        System.out.println();


        BankUser user = new BankUser(firstName, lastName, Email, userName, Password);
        System.out.println(user);

        File filesOfUsers = new File("data.txt");
        FileWriter fileWriter = new FileWriter(filesOfUsers, true);
        fileWriter.write(user.toFileString()+"\n");
        fileWriter.close();
    }

    static Scanner scanner = new Scanner(System.in);
    static double amount = 0;
    public static void deposit(BufferedReader consoleReader) {
        System.out.println("How much money would you like to deposit?");
        double depo = scanner.nextDouble();
        amount+=depo;
        System.out.println("Your amount is: "+amount);
    }

    public static void withdraw(BufferedReader consoleReader) {
        System.out.println("How much money would you like to withdraw from your account?");
        double withdrawal =scanner.nextDouble();
        if(amount >= withdrawal){
            amount-=withdrawal;
            System.out.println("Your total amount is: "+amount);
        }else if(amount<withdrawal){
            System.out.println("Insufficient funds");
        }

    }

    public static void check_balance(BufferedReader consoleReader) {
        System.out.println("Your balance on the account is: " +amount);
    }

}