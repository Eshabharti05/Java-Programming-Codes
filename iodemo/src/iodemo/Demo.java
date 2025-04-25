/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iodemo;
import java.io.*;
/**
 *
 * @author hp
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String msg;
            InputStreamReader ins=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(ins);
            System.out.println("Enter message");
            msg=br.readLine();
            System.out.println(msg);
            
        }
        catch(IOException e)
        {
    }
    }
}
    

