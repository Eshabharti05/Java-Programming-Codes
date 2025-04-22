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
public class Student {
 int rollno;
 String stname;
 String course;
 
 Student(int r,String nm,String cs)
 {
     rollno=r;
     stname=nm;
     course=cs;
 }
 void getDetails()
 {
     System.out.println("Student Roll number "+rollno);
     System.out.println("Student Name "+stname);
     System.out.println("Student's Course"+course);
 }
}
