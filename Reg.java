
package java_project;
import java.io.*;

public class Reg extends LoginMenu {
    
    private String username;//this is the the username variable for reg
    private String password;//this is the password variable for reg

    public Reg(){
    }

    public Reg(String username, String password){
        this.username = username;//this transfers the login input from LoginMenu to the username variable here
        this.password = password;//this transfers the login input from LoginMenu to the password variable here
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
//getter and setter makes the variables accessible throughout the whole program
    public void Registration(){
        System.out.println("Registration Successful.");
    }

    public void SavedLoc() throws IOException{
        FileWriter fileWrite = null;
        BufferedWriter bufferedWrite = null;

        try{
            File saveloc = new File("User_Data.txt");// create new txt file 

            if(!saveloc.exists()) {
                saveloc.createNewFile();//create new txt file if txt don't exist
            }
            fileWrite = new FileWriter(saveloc.getAbsoluteFile(),true); // save username & password into txt file
            bufferedWrite = new BufferedWriter(fileWrite);

            bufferedWrite.write(username + "\t" + password +"\n");
        
            } catch (IOException e){
            e.getCause();
            } finally {
                    try {
                    if (bufferedWrite != null){
                        bufferedWrite.close();//close file
                        }
                    if (fileWrite != null){
                    fileWrite.close();//close file
                    }
                    } catch (IOException e){
                    e.getCause();
                    }
            }
        }
    }
