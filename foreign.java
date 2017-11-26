package java_project;
import java.util.*;

/*
 * @author Navin & Jeremy
 */
public class foreign {
    
    //static values 
    static String monz;
    static double GBPval;
    static double USDval;
    static double EURval;
    static boolean GBRtag = true;
    static boolean USDtag = true;
    static boolean EURtag = true;
    
    public foreign() {
        //class declaration
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nYou have selected foreign savings plan!");
        System.out.println("\nPlease select your preferred currency\n");
        System.out.println("\n   1.  GBP\n   2.  USD\n   3.  EUR\n");
        System.out.print("Output: ");
        
        int selection = sc.nextInt();
        
        while (selection < 1 || selection > 3) {
            System.out.println("Invalid input. Please try again.");
            System.out.print("Output: ");
        }
        
        switch (selection) {
            case 1: System.out.println("You have selected GBP as your preferred currency\n");
                    //fvalue(GBval, USDval, EURval);
                    fvalue GBP = new fvalue(GBPval = 0,  USDval = 1.33, EURval = 1.12);
                    monz = "GBP";
                    GBRtag = false;
                    break;
            case 2: System.out.println("You have selected USD as your preferred currency\n");
                    fvalue USD = new fvalue(GBPval = 0.75, USDval = 0, EURval = 0.84);
                    monz = "USD";
                    USDtag = false;
                    break;
            case 3: System.out.println("You have selected EUR as your preferred currency\n");
                    fvalue YEN = new fvalue(GBPval = 0.89, USDval = 1.19, EURval = 0 );
                    monz = "EUR";
                    EURtag = false;
                    break;
        }       
    }
    
    
    
    
    public void calculation() {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        
        double intrate = 0;
        double init = 0;
        double minD = 0;
        
        double ans_GBP;
        double ans_USD;
        double ans_EUR;
        
        menu();
        while (cont) {
            
            System.out.println("1.  Foreign Emergency Allowance\n       -Interest: 0.5% per annum\n       -Minimum Depoist: 500" + foreign.monz);
            System.out.println("2.  Short-Term Retirement Savings Plans (Foreign)\n       -Interest: 1% per month\n       -Minimum Depoist: 1,000" + foreign.monz);
            System.out.println("3.  Large Value Foreign Currency Savings Plan\n       -Interest: 2.2% per month\n       -Minimum Depoist: 100,000" + foreign.monz);
            System.out.println("4.  International College Fund (" + monz + ")\n       -Interest: 0.7% per month\n       -Minimum Depoist: 1,000" + foreign.monz);    
            System.out.println("0.  Back\n");
            
            int option = sc.nextInt();

            switch (option) {
                case 1: intrate = (0.5 / 12);
                        minD = 500;
                        System.out.println("You have selected Foreign Emergency Allowance\n");
                        break;
                case 2: intrate = (1 / 12);
                        minD = 1000;
                        System.out.println("You have selected Short-Term Retirement Savings Plans (Foreign)\n");
                        break;
                case 3: intrate = (2.2 / 12);
                        minD = 100000;
                        System.out.println("You have selected Large Value Foreign Currency Savings Plan\n");
                        break;
                case 4: intrate = (0.7 / 12);
                        minD = 1000;
                        System.out.println("You have selected International College Fund (" + monz + ")]n");
                        break;
                case 0: System.out.println("Are you sure you wish to return to the previous menu?   [Y/N]");
                                                
                        char option2 = sc.next().charAt(0);

                        switch (option2) {
                            case 'y' :System.out.println("Returning to previous menu...\n");
                                      cont = false;
                                      break;
                            case 'Y' :System.out.println("Returning to previous menu...\n");
                                      cont = false;
                                      break;
                            case 'n' :break;
                            case 'N' :break;
                            default: System.out.println("Your input is invalid");
                                     break;
                        }
            }
            
            System.out.println("Please enter your initial deposit");
            System.out.print("Option:   ");
            init = sc.nextDouble();
            System.out.println(" ");
            
            while (init < minD) {
                System.out.println("Your entered deposit is too low . Please enter a deposit value equal or larger than " + minD + " " + monz);
                System.out.print("Option:   ");
                init = sc.nextDouble();
                System.out.println(" ");
            }
            
            System.out.println("Please enter your desired duration in months");
            System.out.print("Months: ");
            int months = sc.nextInt();
            System.out.println("\n");
            
            while (months < 0) {
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
            
            System.out.println("Please enter your monthly deposit");
            System.out.print("Monthly deposit: ");
            double monthly = sc.nextDouble();
            System.out.println("\n");
            
            if (monthly < 0) {
                System.out.println("Your entered monthly deposit is nonsensical. Please enter a legitimate value");
                System.out.print("Monthly deposit: ");
                monthly = sc.nextDouble();
                System.out.println("\n");
            }
            
            double total = 0;
            
            for (int i = 1; i <= months; i++) {
                
                total = init + monthly + (intrate * total);
                
                System.out.print("Month " + i +": " );
                System.out.printf("%.2f", total);
                System.out.println(monz);
            }
            
            System.out.println("Would you like to convert your plan's monthly  values to the other offered currencies?");
            
            char option3 = sc.next().charAt(0);
            
            switch (option3) {
                
                case 'y': System.out.println("Please select from your available options");
                
                          if (GBRtag = false) {
                            System.out.println("  1.    USD\n   2.  EUR\n");
                          }
                          
                          if (USDtag = false) {
                            System.out.println("  1.    GBP\n   2.  EUR\n");
                          }
                          
                          if (EURtag = false) {
                            System.out.println("  1.    GBP\n   2.  USD\n");
                          }

                          int option4 = sc.nextInt();

                          while (option4 > 1 || option4 < 2) {
                              System.out.println("Invalid input. Please enter a legitimate input.");
                          }
                          
                          switch (option4) {
                              case 1:   if (GBRtag = false) {
                                  
                                            for (int i = 1; i <= months; i++) {
                
                                            total = init + monthly + (intrate * total);
                                            total = total * USDval;

                                            System.out.print("Month " + i +": " );
                                            System.out.printf("%.2f", total);
                                            System.out.println(monz);
                                            }
                                            
                                        }
                              
                                         else {
                                            
                                            for (int i = 1; i <= months; i++) {
                
                                            total = init + monthly + (intrate * total);
                                            total = total * GBPval;

                                            System.out.print("Month " + i +": " );
                                            System.out.printf("%.2f", total);
                                            System.out.println(monz);
                                            }
                                            
                                        }
                                        break;
                              case 2:   if (EURtag = false) {
                                            
                                            for (int i = 1; i <= months; i++) {

                                                      total = init + monthly + (intrate * total);
                                                      total = total * USDval;

                                                      System.out.print("Month " + i +": " );
                                                      System.out.printf("%.2f", total);
                                                      System.out.println(monz);
                                                      }
                                            }
                                            
                                        else {
                                              
                                            for (int i = 1; i <= months; i++) {
                
                                            total = init + monthly + (intrate * total);
                                            total = total * GBPval;

                                            System.out.print("Month " + i +": " );
                                            System.out.printf("%.2f", total);
                                            System.out.println(monz);
                                            }
                                        }
                          }
                          
                          System.out.println("Returning to previous menu");

                          break;
                            
                case 'Y' :System.out.println("Please select from your available options");
                
                          if (GBRtag = false) {
                            System.out.println("  1.    USD\n   2.  EUR\n");
                          }
                          
                          if (USDtag = false) {
                            System.out.println("  1.    GBP\n   2.  EUR\n");
                          }
                          
                          if (EURtag = false) {
                            System.out.println("  1.    GBP\n   2.  USD\n");
                          }

                          option4 = sc.nextInt();

                          while (option4 > 1 || option4 < 2) {
                              System.out.println("Invalid input. Please enter a legitimate input.");
                          }
                          
                          switch (option4) {
                              case 1:   if (GBRtag = false) {
                                  
                                            for (int i = 1; i <= months; i++) {
                
                                                total = init + monthly + (intrate * total);
                                                total = total * USDval;

                                                System.out.print("Month " + i +": " );
                                                System.out.printf("%.2f", total);
                                                System.out.println(monz);
                                            }
                                            
                                        }
                              
                                         else {
                                            
                                            for (int i = 1; i <= months; i++) {
                
                                                total = init + monthly + (intrate * total);
                                                total = total * GBPval;

                                                System.out.print("Month " + i +": " );
                                                System.out.printf("%.2f", total);
                                                System.out.println(monz);
                                            }
                                            
                                        }
                                        break;
                              case 2:   if (EURtag = false) {
                                            
                                            for (int i = 1; i <= months; i++) {

                                                total = init + monthly + (intrate * total);
                                                total = total * USDval;

                                                System.out.print("Month " + i +": " );
                                                System.out.printf("%.2f", total);
                                                System.out.println(monz);
                                                }
                                            }
                                            
                                        else {
                                              
                                            for (int i = 1; i <= months; i++) {
                
                                            total = init + monthly + (intrate * total);
                                            total = total * GBPval;

                                            System.out.print("Month " + i +": " );
                                            System.out.printf("%.2f", total);
                                            System.out.println(monz);
                                            }
                              }
                          }
                          
                          System.out.println("Returning to previous menu");

                          break;
                case 'n' :break;
                case 'N' :break;
                default: System.out.println("Your input is invalid. Returning to the menu...\n");
                         break;
            }
            
            System.out.println("Would you like to change your currency value?   [Y/N]");
            
            char option5 = sc.next().charAt(0);

                        switch (option5) {
                            case 'y' :menu();
                                      break;
                            case 'Y' :menu();
                                      break;
                            case 'n' :break;
                            case 'N' :break;
                            default: System.out.println("Your input is invalid");
                                     break;
                        }
            
        }
  
    }
        
}