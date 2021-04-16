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
public class Student extends Person {
    int grade;
    static String classStatus;
    
    Student(Person p,String classStatus){
        super(p);
        this.classStatus=classStatus;
        
    }
    
    public String toString(){
        return "Student Name: " +name+",Class: "+getClass();
    
    }
    
}
