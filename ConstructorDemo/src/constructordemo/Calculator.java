/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructordemo;

/**
 *
 * @author Acer
 */
public class Calculator 
{
 int num1,num2;  
  Calculator()
  {
      num1=56;
      num2=10;
  }
  Calculator(int x,int y)
  {
      num1=x;
      num2=y;
  }
  void add()
  {
      int res=num1+num2;
      System.out.println("Sum of two numbers is "+res);
  }
  void subtract()
  {
      int res=num1-num2;
      System.out.println("Difference of two numbers is "+res);
  }
}
