/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fday;
import java.util.*;

/**
 *
 * @author Acer
 */
public class Fday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2,res,menu;
        Scanner sc=new Scanner(System.in);
       
       
        System.out.println("Enter num1:");
         num1 =sc.nextInt();
        System.out.println("Enter num2:");
         num2 =sc.nextInt();
        
        
     
    
        System.out.println("Menu----------");
        System.out.println("1.Addition");
        System.out.println("2.Subrtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.division");
        System.out.println("Enter your choice");
        
       menu=sc.nextInt();
       
       switch (menu)
    
      {
           case 1:System.out.println(num1+num2);
           break;
           case 2:System.out.println(num1-num2);
           break;
           case 3:System.out.println(num1*num2);
           break;
           case 4:System.out.println(num1/num2);
           break;
           default :System.out.println("Invalid choice");
           
          
             
      }
      
        
        
    }
    
}
