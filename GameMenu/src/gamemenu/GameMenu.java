
package gamemenu;
import java.util.*;

public class GameMenu {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Game Menu");
System.out.println("Press Number Between 1 and 4");
    int a=sc.nextInt();
    switch (a)
    {
        case 1 : System.out.println("Play Game"); break;
        case 2 : System.out.println("Game Instructions"); break;
        case 3 : System.out.println("High scores"); break;
        case 4 : System.out.println("Exit Game"); break;
        default : System.out.println("ERROR (Invalid number input)");
    }
    
    }
    
}
