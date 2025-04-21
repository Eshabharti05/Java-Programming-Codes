/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertdemo;

/**
 *
 * @author Acer
 */
public class AssertDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=-23;
       assert x>0:"Sorry ,x should not be -ve";
        System.out.println("x="+x);
    }
    
}
