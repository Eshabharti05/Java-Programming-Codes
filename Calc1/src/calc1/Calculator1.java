/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

/**
 *
 * @author Acer
 */
public class Calculator1 {

   void add(int a,int b)
   {
    int c=a+b;
    System.out.println("Sum of two number is "+c);
   }       
    public static void main(String[] args) {
     Calculator1 cl=new Calculator1();
     cl.add(25, 25);
    }
    
}
