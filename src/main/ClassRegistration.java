package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassRegistration {

    public ClassRegistration() throws IOException {
        System.out.println("Thank you for choosing class registration."
                + "\nPlease pick a class you would like to join!");
        System.out.println("1)Mathematics\n2)English\n3)Chemistry\n4)Programming\n"+
                            "If you wish to exit, please enter 0");
        Scanner scan = new Scanner(System.in);
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //ArrayList<BufferedReader> classes = new ArrayList<>();
        ArrayList<String> classes = new ArrayList<>();
        Boolean isOn = true;
        while(isOn) {
            int classScan = scan.nextInt();
            if(classScan==0){

                isOn=false;
                continue;
            }else if(classScan==1){
                String string1="Mathematics";
                classes.add(string1);
            }else if(classScan ==2){
                classes.add("English");
            }else if(classScan==3){
                classes.add("Chemistry");
            }else if(classScan==4){
                classes.add("Programming");
            }else{
                System.out.println("Sorry you picked the wrong number!");
            }
            //classes.add(classScan);
        }
        System.out.println("Your schedule for next semester is: "+classes);
        //Boolean isOn = true;
        //if(isOn && !(input == null)) {
        //  //classes.add(input);
        // System.out.println(classes);

    }
}