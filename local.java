package java_project;

import java.util.Scanner;

public class local extends main {
    
    double intrate = 0;
    double deposit = 0;
    double monthly = 0;
    int months = 0;
    
    public double Emergency (double x) {
        
        Scanner sc = new Scanner(System.in);
        intrate = (0.5 / 12);
        System.out.println("\nPlease enter your deposit value");
        
        System.out.print("Deposit: ");
        deposit = sc.nextDouble();
        
        while (deposit < 500) {
            
            System.out.println("\nYour deposit value is too low. Please enter a value equal or more than 500");
            System.out.print("Deposit: ");
            deposit = sc.nextDouble();
            
        }
        
        System.out.println("\nPlease enter you percieved duration (months)");
        
        System.out.print("Months: ");
        months = sc.nextInt();
        
        while (months <= 0) {
            
            if (months == 0) {
                System.out.println("Instead of calculating here, why not calculate manually since you have no intention of saving at all.\n");
            }
            else {
                System.out.println("It is safe to say you will be actively losing money if you go back in time.\n Please enter a more realistic value.\n");
            }
            
            System.out.print("Months: ");
            months = sc.nextInt();
            System.out.println("\n");
        }
        
        System.out.println("\nPlease enter your monthly deposit value");
        
        System.out.print("Monthly Deposit: ");
        monthly = sc.nextInt();
        
        while (monthly < 0) {
            System.out.println("Invalid input. Please try again");
            System.out.print("Monthly Deposit: ");
            monthly = sc.nextInt();
            System.out.println("\n");
        }
        
        //counter to print out the money value
        for (int i = 1; i <= months; i++) {
            
            if (i == 1) {
                x = deposit + monthly + (intrate * (monthly + deposit));
            }
            else {
                x = x + monthly + (intrate * (monthly + x));
            }
            
            System.out.print("Month " + i +": " );
            System.out.printf("%.2f", x);
            System.out.println(" MYR");
            
        }
        
        System.out.println("\n");
        
        return x;
      
    }
    
    @Override
    public void localamt() {
        local money = new local();
        Scanner sc = new Scanner(System.in);
        boolean taquito = true;
        
        System.out.println("You have chosen local savings plan!\n");
        System.out.println("Below are list of savings plans (descriptions included) available for your choosing.\n");
        
        while (taquito) {
            
            System.out.println("1.  Emergency Savings Plans\n       -Interest: 0.5% per annum\n       -Minimum Depoist: 500 MYR");
            System.out.println("2.  Short-Term Retirement Savings Plans\n       -Interest: 1% per month\n       -Minimum Depoist: 1500 MYR");
            /*System.out.println("1.  Emergency Savings Plans\n       -Interest: 0.5% per month\n       -Minimum Depoist: 500 MYR");
              System.out.println("1.  Emergency Savings Plans\n       -Interest: 0.5% per month\n       -Minimum Depoist: 500 MYR");
              System.out.println("1.  Emergency Savings Plans\n       -Interest: 0.5% per month\n       -Minimum Depoist: 500 MYR");*/
            System.out.println("0.  Back\n");
                
            System.out.print("Option: ");
            
            int tostada = sc.nextInt();
            
            while (tostada < 0 || tostada > 2) {
                System.out.println("Invalid input. Please try again");
                System.out.print("Option: ");
                tostada = sc.nextInt();
            }
            
            switch (tostada) {
                case 1: System.out.println("You have chosen Emergency Savings Plan!\n");
                        money.Emergency(0);
                        System.out.println("Would you like to return to the menu");
                        break;
                case 2: taquito = false;
                        break;
                case 0: System.out.println("You have chose to return to the previous menu");
                        taquito = false;
                        break;
            }   
        }
    }   
}
