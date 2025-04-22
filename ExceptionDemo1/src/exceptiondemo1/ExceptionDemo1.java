/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo1;

/**
 *
 * @author Acer
 */
public class ExceptionDemo1 {

    /**
     * @param args the command line arguments
     */
    void divide(int num1,int num2)
    {
        int res=0;
        try
        {
           
            res=num1/num2;
             System.out.println("Welcome");
            System.out.println("Result="+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Sorry,a number cannot be divided by zero");
        }
    }
    public static void main(String[] args) {
     ExceptionDemo1 d=new ExceptionDemo1();
     d.divide(40, 0);
    }
    
}
