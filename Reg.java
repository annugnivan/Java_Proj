
package java_project;
import java.io.*;

public class Reg {
    
    private String username;
    private String password;

    public Reg(){
    }

    public Reg(String username, String password){
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

    public void print(){
        System.out.println("Welcome, " + username + ", you are now successfully registered!");
    }

    public void saveDeets() throws IOException{
        FileWriter fileWrite = null;
        BufferedWriter bufferedWrite = null;

        try{
            File file = new File("database.txt");

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
