package java_project;
import java.util.*;

/*
 * @author Navin & Jeremy
 */
public class foreign extends main{
    
    double intrate = 0;
    double deposit = 0;
    double monthly = 0;
    double GBPval = 0;
    double USDval = 0;
    double YENval = 0;
    double MYRval = 0;
    int months = 0;
    
    public double GBP_Emergency (double x) {
        
        Scanner sc = new Scanner(System.in);
        intrate = 0.5;
        System.out.println("\nPlease enter your deposit value");
        
        System.out.print("Deposit: ");
        deposit = sc.nextDouble();
        
        while (deposit < 500) {
            
            System.out.println("\nYour deposit value is too low. Please enter a value more than 500");
            System.out.print("Deposit: ");
            deposit = sc.nextDouble();
            
        }
        
        System.out.println("\nPlease enter you percieved duration (months)");
        
        System.out.print("Months: ");
        months = sc.nextInt();
        
        while (months <= 0) {
            
            if (months == 0) {
                System.out.println("Instead of calculating here, why not calculate manually since you have no intention of saving at all.");
            }
            else {
                System.out.println("It is safe to say you will be actively losing money if you go back in time. Please enter a more realistic value.");
            }
            
            System.out.print("Months: ");
            months = sc.nextInt();
        }
        
        System.out.println("\nPlease enter your monthly deposit value");
        
        System.out.print("Monthly Deposit: ");
        monthly = sc.nextInt();
        
        while (monthly < 0) {
            System.out.println("Invalid input. Please try again");
            System.out.print("Monthly Deposit: ");
            monthly = sc.nextInt();
        }
        
       //counter that prints out the values based off input
        for (int i = 1; i <= months; i++) {
            
            //i starts off at 1 because each plan starts off at month 1
            if (i == 1) {
                x = deposit + monthly + (intrate * (monthly + deposit));
            }
            else {
                x = x + monthly + (intrate * (monthly + x));
            }
            
            System.out.print("Month " + i +": " );
            System.out.printf("%.2f", x);
            System.out.println(" GBP");
        
        }
        
        System.out.println("\n");
        
        return x;
        
    }
    
    public void YEN () {
        
    }
    
    public void GBP () {
        
        YENval = 149.89;
        USDval = 1.31;
        MYRval = 5.55;
    }
    
    public void USD () {
       
    }
    
    @Override
    public void foreignamt() {
        
        boolean arroz = true;
        boolean cerveza = true;
        
        while (arroz) {
        
            Scanner sc = new Scanner(System.in);
            
            foreign fmonz = new foreign();
            
            System.out.println("You have chosen Foreign Savings Plan!");
            System.out.println("Select the currency you wish to use \n");
            System.out.println("1. USD\n2. GBP\n3. YEN\n4. Go back\n");
            System.out.print("Option: ");

            int option3 = sc.nextInt ();

            while (option3 < 1 || option3 > 4) {
                System.out.println("Invalid input. Please try again \n");
                System.out.print("Option: ");
                option3 = sc.nextInt();
            }

            switch (option3) {
                case 1: System.out.println ("You have selected USD as your designated currency\n\n");
                        break;
                case 2: System.out.println ("You have selected GBP as your designated currency\n\n");
                        fmonz.GBP();       
                        break;
                case 3: System.out.println ("You have selected YEN as your designated currency\n\n");
                        break;
                case 4: System.out.println("You will be returned to the menu\n\n");
                        arroz = false;
                        break;
            }
            
            System.out.println("Below are list of savings plans (descriptions included) available for your choosing.\n");
            System.out.println("Please note that each savings plan requires a monthly deposit.");
            
            while (cerveza) {
                
                System.out.println("1.  Emergency Savings Plans (Foreign)\n       -Interest: 0.5% per annum\n       -Minimum Depoist: 500 GBP");
                System.out.println("0.  Exit Menu");
                
                System.out.print("Option: ");
            
            int tostada = sc.nextInt(); //triggers switch case
            
            //validation for switch case
            while (tostada < 0 || tostada > 5) {
                System.out.println("Invalid input. Please try again");
                System.out.print("Option: ");
                tostada = sc.nextInt();
            }
            
            switch (tostada) {
                case 1: System.out.println("You have chosen Emergency Savings Plan!\n");
                        fmonz.GBP_Emergency(0);
                        System.out.println("Would you like to convert your ");
                        break;
                case 0: System.out.println("You have chosen to return to the previous menu");
                        cerveza = false; //exits the method thus returning to the main.java class
                        break;
            }
            
            System.out.println("Returning to the list menu\n\n");
            }
        }   
    }  
}