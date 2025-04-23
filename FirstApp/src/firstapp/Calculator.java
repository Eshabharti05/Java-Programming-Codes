/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;

/**
 *
 * @author Acer
 */
public class Calculator {
    int num1,num2;
    void accept (int a,int b)
    {
        num1=a;
        num2=b;
        System.out.println("Numbers are "+num1+" and "+num2);
    }
    void add ()
    {
        int sum = num1+num2;
        System.out.println("sum of two number is"+sum);
        
           
    }
    void subtract ()
    {
        int res =num1-num2;
        System.out.println("result="+res);
        
    }
            
}
