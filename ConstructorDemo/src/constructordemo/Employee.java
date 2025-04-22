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
public class Employee {
    int code;
    String emname;
    String company;
    
    Employee(int c,String em,String cm)
    {
        code=c;
        emname=em;
        company=cm;
        
        
    }
    void getDetails()
    {
        System.out.println("Employee Code : "+code);
        System.out.println("Employee Name : "+emname);
        System.out.println("Employee Company : "+company);
    }
}
