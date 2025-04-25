/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.io.* ;


public class Javademo {

    
    public static void main(String[] args) throws IOException {
        try( BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Enter a number");
            String s=br.readLine();
            System.out.println("Enter 2nd number");
            String s1=br.readLine();
            int i=Integer.parseInt(s);
            int i1=Integer.parseInt(s1);
            int i3=i-i1;
            System.out.println("sum "+i3);
        }
     
        
    
}
