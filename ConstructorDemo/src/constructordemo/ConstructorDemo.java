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
public class ConstructorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Student st=new Student(27,"Saurav Kumar","C++");
     Student st1=new Student(23,"Rishav","Java");
     Student st2=new Student (14,"Ram","Sql");
     Student st3=new Student (17,"Shyam","Php");
    
     st.getDetails();
     st1.getDetails();
     st2.getDetails();
     st3.getDetails();
     
   // System.out.println("Student Name :\t"+st.stname+"\t Student Rollno :"+st.rollno+"\t Student's Course :"+st.course);
    //System.out.println("Student Name :\t"+st1.stname+"\t Student Rollno :"+st1.rollno+"\t Student's Course :"+st1.course);
    //System.out.println("Student Name :\t"+st2.stname+"\t Student Rollno :"+st2.rollno+"\t Student's Course :"+st2.course); 
    //System.out.println("Student Name :\t"+st3.stname+"\t Student Rollno :"+st3.rollno+"\t Student's Course :"+st3.course);

    }
    
}
