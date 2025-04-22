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
public class Customer {
    int age;
    void setAge(int x) throws MyException
    {
        if(x<0)
            throw new MyException("Sorry,Age cannot be -ve");
        else
            age=x;
    }
    void getAge()
    {
        System.out.println("Age of Customer is "+age);
    }
    
}
