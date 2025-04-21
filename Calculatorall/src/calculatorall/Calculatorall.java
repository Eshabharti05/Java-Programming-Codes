/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorall;

import mypackage.Student;

/**
 *
 * @author Acer
 */
public class Calculatorall {

  void add(int a,int b)
  {
      int c=a+b;
      System.out.println("Sum of two number is "+c);
  }
  void subtract(int a,int b)
  {
      int c1=a-b;
      System.out.println("Difference of two number is "+c1);
  }
  void multiply(int a, int b)
  {
      int c2=a*b;
      System.out.println("Product of two number is "+c2);
  }
  void divide(int a,int b)
  {
      int c3=a/b;
      System.out.println("Division of two number is "+c3);
  }
    public static void main(String[] args) {
     Student st=new Student();
     st.get();
     
    }
    
}
