/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8Example2;

/**
 *
 * @author Amulya Mallepalli
 */
public class Question8DriverExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cricket c=new Cricket();
        Badminton b=new Badminton();
        System.out.println("Normal Method");
        c.run();
        System.out.println("Abstract Method");
        b.getGameNames();
    }
    
}
