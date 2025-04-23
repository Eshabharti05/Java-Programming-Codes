/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public interface Games {
    String msg="WELCOME";
    public void score()
    {
        Class Games implements Game
                {
                    void GameList()
                    {
                        System.out.println(" Game list ");
                        System.out.println(1+" Moto GP ");
                        System.out.println(2+" Call of Duty ");
                        System.out.println(3+" Mario ");
                    }
                    void UserInput()
                    {
                        Scanner s=new Scanner(System.in);
                        int input;
                        System.out.println(" Enter your choice ");
                        input=s.nextInt();
                    }
                    
                    
                }
                           
                
    }
          
}
