
package arraydemo;


public class Arraydemo {

   
    public static void main(String[] args) {
   int x[]=new int[]{2,51,12,4,56,21,85,47,92,54,97};
   int max=0;
        System.out.println("Numbers - ");
        System.out.println("-------------");
   for (int i=0;i<x.length;i++)
   {
       System.out.println(x[i]);
       if (x[i]>max)
           max=x[i];
   }
        System.out.println("-------------");
        System.out.println("Total Numbers - "+x.length);
        System.out.println("Greater Number is - "+max);
    }
    
}
