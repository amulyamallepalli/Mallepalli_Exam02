/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4Example1;

/**
 *
 * @author Amulya Mallepalli
 */
public class Question4DriverExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruits fr=new Fruits(4);
        Mango ma=new Mango(98,5);
        System.out.println(fr.toString());
        System.out.println(ma.toString());
        //Inheritance
        System.out.println(ma.getWeight());
        //polymorphic substitution
        Fruits fr1=new Mango(50,6);
        //late Binding polymorphism
         System.out.println(fr.toString());
         System.out.println(fr1.toString());
              
        
        
    }
    
}
