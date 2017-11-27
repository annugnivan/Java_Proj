package java_project;

import java.io.*;
import java.util.*;

public class LoginMenu extends main {
    
    public static void Loginmenu ()throws IOException{
        
        String name;
        String password;
        boolean start = true;
        
        while (start){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Junior's Savers App");
        System.out.println("Select the following options");
        System.out.println("1: Sign Up \n2: Sign In\n");
        System.out.print("Option: ");
        
        int optionLOGIN = sc.nextInt();
        
        while (optionLOGIN < 1 || optionLOGIN > 3){
                System.out.println("Invalid input. Please try again");
                System.out.print("Option: ");
                optionLOGIN = sc.nextInt();}
        
        switch(optionLOGIN){
            case 1: System.out.println("Creating a new account");
                    System.out.println("Enter a username");
                    System.out.print("Username: ");
                    name = sc.next();
                    System.out.println("Enter a password");
                    System.out.print("Password: ");
                    password = sc.next();
                    
                    Reg user1 = new Reg(name, password);
                    
                    System.out.println("You have succesfully registered an account");
                    user1.SavedLoc();
                    break;
                   
            case 2: System.out.println("Sign In");
                    System.out.print("Enter Username: ");
                    name = sc.next();
                    System.out.print("Enter Password: ");
                    password = sc.next();
                    SignIn user2 = new SignIn(name, password);

                    user2.Signingin();
                    start = false;
            }
        }
    }
}
    

