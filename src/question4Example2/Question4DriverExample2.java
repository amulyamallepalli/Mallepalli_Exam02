/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4Example2;

/**
 *
 * @author Amulya Mallepalli
 */
public class Question4DriverExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ElectronicItems e=new ElectronicItems("Nokia");
        SoundSystems s=new SoundSystems("Apple","Samsung");
        System.out.println(e.toString());
        System.out.println(s.toString());
        //Inheritance
        System.out.println(s.getPhones());
        //polymorphic substitution
        ElectronicItems e1=new SoundSystems("OnePlus","Moto G");
        //late Binding polymorphism
         System.out.println(e.toString());
         System.out.println(e1.toString());
              
    }
    
}
