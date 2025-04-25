/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioimage;
import java.io.*;

/**
 *
 * @author hp
 */
public class Demo {

    
    public static void main(String[] args)throws IOException {
       FileInputStream f=new FileInputStream("d:\\PHOTOS\\esha.jpg");
       FileOutputStream fos=new FileOutputStream("d:\\MOVIES\\dx.jpg");
       byte b[]=new byte[1076];
       int len=b.length;
       int n=0;
       while((n=f.read(b))!=-1)
       {
           if(n<len)
           fos.write(b, 0, n);
           else
           {
               fos.write(b);
           fos.flush();
           }
       }
        System.out.println("written");
    }
    
}
