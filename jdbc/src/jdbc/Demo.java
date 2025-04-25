/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
/**
 *
 * @author hp
 */
public class Demo {
Connection con=null;
void getData(){
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Esha","esha12");
        Statement st=con.createStatement();
        ResultSet res=st.executeQuery("select * from Application");
        while(res.next())
        {
            System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
        }
        res.close();
        con.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
    
    public static void main(String[] args) {
        Demo d=new Demo();
        d.getData();
    }
    
}
