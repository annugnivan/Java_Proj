package java_project;
import java.util.*;

/*
 * @author Navin & Jeremy
 */
public class main {
    
    public void localamt() {
        //dummy methods
    }   
    
    public void foreignamt() {
        //dummy methods
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean cheese = true; //as long as cheese = true, the program will not shut down
        
        while (cheese) {
        
            System.out.println("Good day! What you like to do today?\n");
            System.out.println("    1. Savings plans catalogue\n    2. Savings plan tracker\n    3. Watch some helpful videos by our partners to help you start investing!\n    4. Quit\n");
            System.out.print("Option: ");
            
        
            int option = sc.nextInt();
            
            while (option < 1 || option > 4){
                System.out.println("Invalid input. Please try again");
                System.out.print("Option: ");
                option = sc.nextInt();
            }
            
            
            switch (option) { // Savings Plan options
                case 1: //cheese = false; 
                    System.out.println("Savings Plan selected:");
                    System.out.println ("Please select your Savings Plan location\n\n");
                    System.out.println ("1. Local Savings Plan (Malaysia)\n2. Foreign Savings Plan\n\n");
                    System.out.print ("Option: ");


                    int option2 = sc.nextInt();

                    while (option2 < 1 || option2 > 2){
                        System.out.println("Invalid input. Please try again\n");
                        System.out.print("Option: ");
                        option2 = sc.nextInt();}

                        switch (option2)    {
                            case 1: 
                                local localObject = new local();

                                localObject.localamt();
                                break;
                                
                            case 2:
                                foreign foreignObject = new foreign();
                                
                                foreignObject.foreignamt();
                                break; 
                        }    
                case 2: //Printwriter I/O
                        break;
                case 3: //no choice but to use Jlabels for this shit
                        break;
                case 4: System.out.println("Program end");
                        cheese = false;
                        break;
            }
        }   
    }   
}
