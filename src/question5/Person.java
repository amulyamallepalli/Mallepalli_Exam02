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
public class Person {
    String name,address, phoneNumber,emailAddress;
    Person(String name,String address,String phoneNumber,String emailAddress){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }
    
    Person(Person p){
        this.name=p.name;
        this.address=p.address;
        this.phoneNumber=p.phoneNumber;
        this.emailAddress=p.emailAddress;
    }
  
    public String toString(){
        return "Person Name: " +name+",Class: "+getClass();
    
    }
}
