
package java_project;
import java.io.*;

public class Reg {
    
    private String username;//this is the the username variable for reg
    private String password;//this is the password variable for reg
    
    /*
    private String reg_username;
    private String reg_password;
    */

    public Reg(){
    }

    public Reg(String username, String password){
        this.username = username; //this transfers the login input from LoginMenu to the username variable here
        this.password = password; //this transfers the login input from LoginMenu to the password variable here
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
    
    //getter and setter makes the variables accessible throughout the whole program

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    //getter and setter makes the variables accessible throughout the whole program

    public void print(){
        System.out.println("Welcome, " + username + ", you are now successfully registered!");
    }
    
    //saveDeets here is when the input is written into a file that serves as a database
    public void saveDeets() throws IOException{
        FileWriter fileWrite = null;
        BufferedWriter bufferedWrite = null;

        try{
            File file = new File("database.txt");
            
            //creates a database.txt within the project folder
            //we should rename it to user_log

            if(!file.exists()) {
                file.createNewFile();
            }
            fileWrite = new FileWriter(file.getAbsoluteFile(),true);
            bufferedWrite = new BufferedWriter(fileWrite);

            bufferedWrite.write("\n" + username + " " + password);
        } catch (IOException e){
            e.getCause();
        } finally {
            try {
                if (bufferedWrite != null){
                    bufferedWrite.close();
                }
                if (fileWrite != null){
                    fileWrite.close();
                }
            } catch (IOException e){
                e.getCause();
            }
        }
}
    
}
