
package java_project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SignIn extends LoginMenu {
    private String username;
    private String password;

    public SignIn(){//default constructor
    }

    public SignIn(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void Signingin() throws IOException{
        String saveLoc;
        FileReader datastorage;
        String[] loginDetail;
        boolean signIn = false;
        
        try{
            datastorage = new FileReader("User_Data.txt");
            BufferedReader br2 = new BufferedReader(datastorage);

            while((username = br2.readLine()) != null){
            
            loginDetail = username.split("-");
                     
                    if(username.equals(loginDetail[0]) && password.equals(loginDetail[1])){
                    signIn = true;
                    System.out.println("Sign in succesful.");
                    break;
                    }
            }

            if (signIn == false){
                System.out.println("Username and Password does not match.");
            }

            } catch (IOException e){
            System.out.println("An error has occurred");
            }
        
    }
}
