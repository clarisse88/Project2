/*
 * To change this license header, choose License Headers in Project Properties.
 @author MMC Tshikuna 218319363
 */
package distributioncenter;

import java.io.*;
import javax.swing.JOptionPane;


public class User {
    

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean isValidUser() {
        boolean valid = false;
        FileReader inFile = null;
        BufferedReader reader = null;
        String user, pass;
        
        try {
            inFile = new FileReader("User.txt");
            reader = new BufferedReader(inFile);
            
            user = reader.readLine();   // priming read
            while (user != null) {
                pass = reader.readLine();
                if (username.equals(user) && password.equals(pass)) {
                    valid = true;
                    break;
                }
                user = reader.readLine();   // secondary read
            }
            
            reader.close();
            inFile.close();
        } 
        catch (IOException fe) {
            valid = false;
            JOptionPane.showMessageDialog(null, fe.getMessage());
        }
        
        return valid;
    }
}
