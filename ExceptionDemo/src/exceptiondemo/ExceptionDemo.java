/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

/**
 *
 * @author Acer
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Customer cust=new Customer();
      try
      {
      cust.setAge(-8);
      cust.getAge();
      }
      catch(MyException e)
      {
          System.err.println(e.getMessage());
      }
    }
    
}
