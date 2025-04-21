/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertionexample;

/**
 *
 * @author Acer
 */
public class AssertionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=-67;
        assert num>0:"Sorry, Number is -ve";
        System.out.println("Value of num : "+num);
        
    }
    
}
