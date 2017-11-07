package java_project;

import java.util.Scanner;

public class local extends main {
    
    double intrate = 0;
    double deposit = 0;
    double monthly = 0;
    int months = 0;
    int naranja = 0;
    
    public double Emergency (double x) {
        
        Scanner sc = new Scanner(System.in);
        intrate = (0.5 / 12); //the interest rate per annum is divided by twelve month to get the value for a month
        System.out.println("\nPlease enter your deposit value");
        
        System.out.print("Deposit: ");
        deposit = sc.nextDouble();
        
        //validation for the depoist value
        //if the user enters a value less than the deposit value, it will prompt the user to enter again
        while (deposit < 500) {
            
            System.out.println("\nYour deposit value is too low. Please enter a value equal or more than 500");
            System.out.print("Deposit: ");
            deposit = sc.nextDouble();
            
        }
        
        System.out.println("\nPlease enter you percieved duration (months)");
        
        System.out.print("Months: ");
        months = sc.nextInt();
        
        //validation to ensure the user's input of months is not 0
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
        
        //validation to ensure the user enters a monthly deposit < 0
        while (monthly < 0) {
            System.out.println("Invalid input. Please try again");
            System.out.print("Monthly Deposit: ");
            monthly = sc.nextInt();
            System.out.println("\n");
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
            System.out.println(" MYR");
            
        }
    
        System.out.println("\n");
        
        return x;
      
    }
    
    public double Retirement (double x) {
        
        Scanner sc = new Scanner(System.in);
        intrate = (1 / 12);
        System.out.println("\nPlease enter your deposit value");

        System.out.print("Deposit: ");
        deposit = sc.nextDouble();

        while (deposit < 1000) {

            System.out.println("\nYour deposit value is too low. Please enter a value equal or more than 1000");
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
    
    public double Jumbo (double x) {
        
        Scanner sc = new Scanner(System.in);
        intrate = (2.2 / 12);
        System.out.println("\nPlease enter your deposit value");

        System.out.print("Deposit: ");
        deposit = sc.nextDouble();

        while (deposit < 100000) {

            System.out.println("\nYour deposit value is too low. Please enter a value equal or more than 100,000");
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
    
    public double Belajar (double x) {
        
        Scanner sc = new Scanner(System.in);
        intrate = (0.7 / 12);
        System.out.println("\nPlease enter your deposit value");

        System.out.print("Deposit: ");
        deposit = sc.nextDouble();

        while (deposit < 1000) {

            System.out.println("\nYour deposit value is too low. Please enter a value equal or more than 1,000");
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
    
    public double Budak (double x) {
        
        Scanner sc = new Scanner(System.in);
        intrate = (0.2 / 12);
        System.out.println("\nPlease enter your deposit value");

        System.out.print("Deposit: ");
        deposit = sc.nextDouble();

        while (deposit < 10) {

            System.out.println("\nYour deposit value is too low. Please enter a value equal or more than 10");
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
        boolean taquito = true; //as long taquito is true, the method will run in a loop
        
        System.out.println("You have chosen local savings plan!\n");
        System.out.println("Below are list of savings plans (descriptions included) available for your choosing.\n");
        System.out.println("Please note that each savings plan requires a monthly deposit.");
        
        while (taquito) {
            
            System.out.println("1.  Emergency Savings Plans\n       -Interest: 0.5% per annum\n       -Minimum Depoist: 500 MYR");
            System.out.println("2.  Short-Term Retirement Savings Plans\n       -Interest: 1% per month\n       -Minimum Depoist: 1,000 MYR");
            System.out.println("3.  Jumbo Savings Plan\n       -Interest: 2.2% per month\n       -Minimum Depoist: 100,000 MYR");
            System.out.println("4.  Jom Belajar! Junior College Fund\n       -Interest: 0.7% per month\n       -Minimum Depoist: 1,000 MYR");
            System.out.println("5.  Bukit In Progress Junior Savers\n       -Interest: 0.5% per month\n       -Minimum Depoist: 10 MYR");
            System.out.println("0.  Back\n");
                
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
                        money.Emergency(0);
                        System.out.println("Would you like to return to the menu?");
                        break;
                case 2: System.out.println("You have chosen Retirement Savings Plan!\n");
                        money.Retirement(0);
                        break;
                case 3: System.out.println("You have chosen Jumbo Savings Plan!\n");
                        money.Jumbo(0);
                        break;
                case 4: System.out.println("You have chosen Jom Belajar! Junior College Fund!");
                        money.Belajar(0);
                        break;
                case 5: System.out.println("You have chosen Bukin In Progress Junior Savers!");
                        //money.
                        break;
                case 0: System.out.println("You have chosen to return to the previous menu");
                        taquito = false; //exits the method thus returning to the main.java class
                        break;
            }
            
            System.out.println("Returning to the list menu\n\n");
        }
    }   
}