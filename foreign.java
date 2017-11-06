package java_project;
import java.util.*;

/*
 * @author Navin & Jeremy
 */
public class foreign extends main{
    
    double intrate = 0;
    double deposit = 0;
    double monthly = 0;
    /*double GBPval =0;
    double USDval =0;
    double YENval =0;*/
    int months = 0;
    
    public double YEN (double YEN) {
        
        return YEN;
    }
    
    public double GBP (double GBP) {
        
        return GBP;
    }
    
    public double USD (double USD) {
        
        return USD;
    }
    @Override
    public void foreignamt() {
        
        boolean arroz = true;
        
        while (arroz) {
        
            Scanner sc = new Scanner(System.in);
            
            foreign monz = new foreign();
            
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
                case 1: System.out.println ("You have selected USD ");
                        break;
                case 2: System.out.println ("You have selected GBP ");
                        double GBP_YEN;
                        double GBP_USD;
                        GBP_YEN = monz.YEN(151.83);
                        
                        
                        
                        break;
                case 3: System.out.println ("You have selected YEN ");
                        break;
                case 4: System.out.println("You will be returned to the menu\n\n");
                        arroz = false;
                        break;
            }
        }
    }  
}