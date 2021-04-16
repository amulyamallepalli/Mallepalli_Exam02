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
public class Employee extends Person{
    float salary;
    String dateHired,office;
    
    Employee(Person p,float salary,String dateHired,String office){
        super(p);
        this.salary=salary;
        this.dateHired=dateHired;
        this.office=office;
    }
    Employee(Person p,Employee e){
        super(p);
        this.salary=e.salary;
        this.dateHired=e.dateHired;
        this.office=e.office;
    }
    public String toString(){
        return "Employee Name: " +name+",Class: "+getClass();
        
    }
    
}
