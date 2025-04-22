/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparabledemo;

/**
 *
 * @author Acer
 */
public class Student implements Comparable<Student>{
   int rollno;
   String name;
   String course;

    public Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
   void getDetails()
   {
       System.out.println(rollno+" "+name+" "+course);
   }

    @Override
    public int compareTo(Student o) {
       int res=this.rollno-o.rollno;
       if(res>0)
           return 1;
       else if(res<0)
           return -1;
       else
           return 0;
    }
}
