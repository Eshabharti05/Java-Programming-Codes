/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator2;

/**
 *
 * @author Acer
 */
public class Calculator2 {

    private int num1=25,num2=15,total;
    void add()
    { int total=num1+num2;
        System.out.println("sum of two number is "+total);
    }
    public static void main(String[] args) {
        Calculator2 ob=new Calculator2();
        ob.add();
       ob.num1=90;
       ob.num2=12;
       ob.add();
       Calculator3 cl=new Calculator3();
       cl.num1=73;
       cl.num2=27;
       cl.add();
       Calculator4 ad=new Calculator4();
       ad.num1=25;
       ad.num2=25;
       ad.add();
    }
    
}
