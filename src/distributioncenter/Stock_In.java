/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributioncenter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author clara
 */
public class Stock_In {
    private int In;
    private int Out;
    private static final String FILE_PATH = "Stock.txt";
    
    public Stock_In() {
    }
    
    public Stock_In(int In,int Out){
        this.In = In;
        this.Out = Out;
    }
    
        public int getIn() {
        return In;
    }

        public int getOut() {
        return Out;
    }
    public void setItemCategory(int In,int Out) {
        this.In = In;
        this.Out = Out;
 
    }
    
    
     public int getPackageOut (int pNumOut){
           
       int numOut = pNumOut;
         int out= pNumOut;
       return out;
       
       }
 public int getPackageNum (){
     
         try{
             
            FileInputStream itemFile = new FileInputStream(FILE_PATH);
            InputStreamReader iSReader = new InputStreamReader(itemFile);
            BufferedReader buffReader = new BufferedReader(iSReader);

            List<String> itemDetails = new ArrayList<>(10);
            String line;
            while ( (line = buffReader.readLine()) != null) {
                itemDetails.add(line);

            }
        
            buffReader.close();
            iSReader.close();
            itemFile.close();

            int sum = 0;
            for(String num : itemDetails){

                if(num.length() > 0)
                    sum+= Integer.parseInt(num);
            }
                
        
            return sum;
        } 
        catch (IOException e) {
            System.out.println("Didn't run");
            e.printStackTrace();
        }
         return -1;
    }
    
}
