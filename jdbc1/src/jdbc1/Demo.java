/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc1;

import java.sql.*;
import java.util.Scanner;
public class Demo {
Connection con=null;
/*void getData(){
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/Application","EshaBharti","eshu12");
        Statement st=con.createStatement();
        ResultSet res=st.executeQuery("select * from StudentList");
        while(res.next())
        {
            System.out.println(res.getString(1)+" "+res.getInt(2)+" "+res.getString(3)+" "+res.getString(4));
        }
        res.close();
        con.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}*/
void getData(int x){
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/Application","EshaBharti","eshu12");
        PreparedStatement ps=con.prepareStatement(" Select * from StudentList where rollno=?");
        ps.setInt(1, x);
        ResultSet res=ps.executeQuery();
        if(res.next() )
        {
            System.out.println(  res.getString(1)+" "+res.getString(3)+" "+res.getString(4));
        }
        else{
            System.out.println("Invalid rollno");
        }
        
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
        
}
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR ROLLNO");
        int y=s.nextInt();
      Demo d=new Demo();
      d.getData(y);
        /*Demo d=new Demo();
      d.getData();
      */
    }
    
}
