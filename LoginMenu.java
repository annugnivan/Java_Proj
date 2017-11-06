
package java_project;

import java.io.*;
import java.util.*;

public class LoginMenu extends Java_Project {
    
    public static void Loginmenu ()throws IOException{
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select the following options");
        System.out.println("1: Sign Up \n2: Sign In\n");
        System.out.print("Option: ");
        
        int optionLOGIN = sc.nextInt();
        
        while (optionLOGIN < 1 || optionLOGIN > 3){
                System.out.println("Invalid input. Please try again");
                System.out.print("Option: ");
                optionLOGIN = sc.nextInt();}
        
        switch(optionLOGIN){
            case 1: System.out.println("Creating new account");
                    System.out.print("Username: ");
                    String name = sc.next();
                    System.out.print("Password: ");
                    String password = sc.next();
                    
                    Reg user = new Reg(name, password);
                    
                    user.print();
                    user.saveDeets();
                    break;
                   
            case 2: System.out.println("Sign In");
                    System.out.print("Enter Username: ");
                    String UserN = sc.next();
                    System.out.print("Enter Password: ");
                    String Pword = sc.next();
                    SignIn user = new SignIn(UserN, Pword);

                    user.loggerin();
                    break;
        }
        
    }

    
    }
    

