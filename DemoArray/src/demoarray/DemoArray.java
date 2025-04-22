
package demoarray;


public class DemoArray {

    
    public static void main(String[] args) {
    
    int x[][]={{4,6,8},
               {12,16,20},
               {40,60,80},
               {100,150,200}};
    for (int[]i:x)
    {
        for (int j:i)
        {
            System.out.print(j+"\t");
        }
        System.out.println();
    }
        
    }
    
}
