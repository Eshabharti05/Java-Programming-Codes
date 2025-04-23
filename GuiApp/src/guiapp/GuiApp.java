/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapp;

/**
 *
 * @author Acer
 */
public class GuiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num=574;
      int sum=0;
      int q,r;
    
      while(num>10)
      {
       q=num/10;
       r=num%10;
       num=q;
       sum=sum+r;
          
      }
      sum=sum+num;
        System.out.println("Result="+sum);
    }
    
}
