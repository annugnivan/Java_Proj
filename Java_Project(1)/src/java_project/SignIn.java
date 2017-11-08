
package java_project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SignIn extends LoginMenu {
    private String username;
    private String password;

    public SignIn(){
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
        String saveLoc = null;
        FileReader datastorage = null;
        boolean signIn = false;
        
        try{
            datastorage = new FileReader("User_Data.txt");
            BufferedReader br = new BufferedReader(datastorage);

            while((username = br.readLine()) != null){
            String[] UserDetail = username.split("\\s");
                    if(username.equals(UserDetail[0]) && password.equals(UserDetail[1])){
                    signIn = true;
                    System.out.println("Sign in succesful.");
                    break;
                    }
            }

            if (signIn == false){
                System.out.println("Username and Password does not match.");
            }

            } catch (IOException e){
            e.getCause();
            }
        
    }
}