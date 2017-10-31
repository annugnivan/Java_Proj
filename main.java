package java_project;
import java.util.*;

/*
 * @author Navin & Jeremy
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean cheese = true; //as long as cheese = true, the program will not shut down
        
        while (cheese) {
        
            System.out.println("Good day! What you like to do today?\n");
            System.out.println("    1. Savings plans catalogue\n    2. Savings plan tracker\n    3. Watch some helpful videos by our partners to help you start investing!\n");
            System.out.print("Option: ");
        
            int option = sc.nextInt();
        
            while (option < 1 || option > 3){
                System.out.println("Invalid input. Please try again\n");
                System.out.print("Option: ");
                option = sc.nextInt();
            }
            switch (option) {
                case 1: cheese = false;
                        System.out.println("Program end");
                case 2: //Printwriter I/O
                case 3: //no choice but to use Jlabels for this shit
            }
        }
    }   
}