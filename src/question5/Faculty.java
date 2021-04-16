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
public class Faculty extends Employee{
    int officeHours,noOfTeachingSubjects;
    
    Faculty(Employee e,Person p,int officeHours,int noOfTeachingSubjects){
        super(p,e);
        this.officeHours=officeHours;
        this.noOfTeachingSubjects=noOfTeachingSubjects;
    }
    
    @Override
    public String toString(){
        return "Faculty Name: "+name+",Class: "+getClass();
        
    }
    
}
