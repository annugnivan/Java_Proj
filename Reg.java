
package java_project;
import java.io.*;

public class Reg extends LoginMenu {
    
    private String username;//this is the the username variable for reg
    private String password;//this is the password variable for reg

    public Reg(){// default constructor
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
    
    public void SavedLoc() throws IOException{
        
            java.io.File saveloc = new java.io.File("User_Data.txt");// create new txt file 

            if(!saveloc.exists()) {
                saveloc.createNewFile();//create new txt file if txt don't exist
            }
            FileWriter fw = new FileWriter(saveloc.getAbsoluteFile(),true); // save username & password into txt file
            BufferedWriter br = new BufferedWriter(fw);

            br.write(username + "-" + password +"\n");
      
            if (br != null){
                br.close();//close file
                }
            if (fw != null){
                fw.close();//close file
                }
                    
    }
}
        
    
