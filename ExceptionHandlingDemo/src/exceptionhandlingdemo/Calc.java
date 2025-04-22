/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingdemo;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,res=0;
        Scanner numbers = new Scanner(System.in);
        Scanner operators = new Scanner(System.in);
        String op;
        System.out.println("Enter the 1st number:");
        num1=numbers.nextInt();
        assert (num1>0):"The Numbers should be greater than 0.";
        System.out.println("Enter the 2nd number:");
        num2=numbers.nextInt();
        assert (num2>0):"The Numbers should be greater than 0.";
        System.out.println("Enter the operator");
        op=operators.nextLine();
        assert ((op.equals("+"))||(op.equals("-"))||(op.equals("*"))||(op.equals("/"))):"The operator is not valid";
        if (op.equals("+"))
            if (op.equals("-"))
            {
                if (num1>num2)
                {
                    res= num1-num2;
                }else
                {
                    res= num2-num1;
                }
            }
            else if (op.equals("*"))
            {
                res=num1*num2;
            }
            else if (op.equals("/"))
            {
                res= num1/num2;
            }
            else
            {
                System.out.println("Wrong Operator");
            }
        else {
            res= num1+num2;
        }
        System.out.println("The Result is "+res);
    }
}


        
                
        
        
        
    
    

