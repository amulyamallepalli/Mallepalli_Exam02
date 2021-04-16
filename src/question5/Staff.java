/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Amulya Mallepalli
 */
public class Staff extends Employee{
    String title;
    Staff(Employee e,Person p,String title){ 
        super(p,e);
        this.title=title;
    }
    public String toString(){
        return "Staff Name:" +name+",Class: "+getClass();
    
    }
    
}
