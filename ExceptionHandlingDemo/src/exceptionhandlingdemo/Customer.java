/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingdemo;

/**
 *
 * @author Acer
 */
public class Customer {
    int age;
    void setAge(int x)throws MyException
    {
        if(x<=0)
            throw new MyException("Customer's age cannot be -ve or zero");
        else
            age=x;
    }
   void getAge()
   {
       System.out.println("Customer's Age is "+age);
   }
}
