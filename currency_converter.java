package java_project;
import java.util.*;


public class currency_converter {
    
    public currency_converter() {
        //class declaraction
    }
    
    public void currency() {
        
        
        double MYRval;
        double USDval;
        double YENval;
        boolean cont = true;
        
        Scanner sc = new Scanner (System.in) ; //to allow the input of data
        System.out.println ("Welcome to The Currency Converter");
        System.out.println("Please select your desired currency type");
        System.out.println("1 = MYR [RM]");
        System.out.println("2 = USD [$]");
        System.out.println("3 = YEN [¥]");
        
        
        while (cont) /*As long cont is true, it will keep on looping*/{
            
            int cashmonz = sc.nextInt(); //allows sc to be used for data input
        
            while (cashmonz > 3 || cashmonz < 1) {
            
                System.out.println("Invalid input, try again");
                cashmonz = sc.nextInt();
            
            }  //validation so only 1 to 3 can be entered
        
            switch (cashmonz) {
            
                case 1 : System.out.println("\nMYR is chosen");
                         System.out.println("Please enter the MYR value");
                         double A = sc.nextDouble();
                         MYRval = MYR(A); //sets the value of MYRval to the returned value
                         System.out.println("The MYR value is " + String.format( "%.2f",MYRval)); 
                         break;
                case 2 : System.out.println("\nUSD is chosen");
                         System.out.println("Please enter the USD value");
                         A = sc.nextDouble();
                         USDval = USD(A); //sets the value of USDval to the returned value
                         System.out.println("The MYR value is " + String.format( "%.2f",USDval));
                         break;
                case 3 : System.out.println("\nYEN is chosen");
                         System.out.println("Please enter the YEN value");
                         A = sc.nextDouble();
                         YENval = YEN(A); //sets the value of YENval to the returned value
                         System.out.println("The MYR value is " + String.format( "%.2f",YENval));
                         break;
            }
            
            System.out.println("\nWould you like to convert again?\n1 = YES       2 = NO");
            
            int option = sc.nextInt();
            
            while (option < 1 || option > 2) {
                
                System.out.println("Invalid input, try again.");
                option = sc.nextInt();
            }
            
            switch (option) {
                
                case 1 :   System.out.println("\nPlease select your desired currency type");
                           System.out.println("1 = MYR [RM]");
                           System.out.println("2 = USD [$]");
                           System.out.println("3 = YEN [¥]");
                           break;
                           
                case 2 :  cont = false; //breaks the cont loop and ends the program
                          break;              
            }
            
           
        }
        
        System.out.println("\nProgram end. Have a nice day.\n");
    }
    
    //function for MYR
    public static double MYR(double x) {
        
        double ANS = 0;
        
       Scanner sc = new Scanner (System.in) ; //to allow the input of data
       
       System.out.println("\nSelect desired conversion method\n 1 = MYR [RM] -> USD [$]\n 2 = MYR [RM] -> YEN [¥]");
       
       int y = sc.nextInt();
       
       while (y > 2 || y < 1) {
           
           System.out.println("Invalid input. Try again.\n");
           y = sc.nextInt();
       } //validation for options
       
       switch (y) {
           
           case 1 : ANS = x * 0.24;
                    break;
           case 2 : ANS = x * 25.71;
                    break;
       }
        
       return ANS;
          
    }     
    
    //function for USD
    public static double USD(double x) {
        
        double ANS = 0;
        
       Scanner sc = new Scanner (System.in) ; //to allow the input of data
       
       System.out.println("\nSelect desired conversion method\n 1 = USD [$] -> MYR [RM]\n 2 = USD [$] -> YEN [¥]");
       
       int y = sc.nextInt();
       
       while (y > 2 || y < 1) {
           
           System.out.println("Invalid input. Try again.\n");
           y = sc.nextInt();
       } //validation for options
       
       switch (y) {
           
           case 1 : ANS = x * 4.20;
                    break;
           case 2 : ANS = x * 107.84;
                    break;
       }
        
       return ANS;
          
    }
    
    //function for YEN
    public static double YEN(double x) {
        
        double ANS = 0;
        
       Scanner sc = new Scanner (System.in) ; //to allow the input of data
       
       System.out.println("\nSelect desired conversion method\n 1 = YEN [¥] -> MYR [RM]\n 2 = YEN [¥] -> USD [$]");
       
       int y = sc.nextInt();
       
       while (y > 2 || y < 1) {
           
           System.out.println("Invalid input. Try again.\n");
           y = sc.nextInt();
       } //validation for options
       
       switch (y) {
           
           case 1 : ANS = x * 0.039;
                    break;
           case 2 : ANS = x * 0.001;
                    break;
       }
        
       return ANS;
    }
}
