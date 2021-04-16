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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1=new Person("Amulya","Missouri","+1234567891","s542411@nwmissouri.edu");
        Person person2=new Person("Apoorva","Connecticut","+2345343458","apoorvamallepally@gmail.com");
        Student student1=new Student(person1,"Sem2");
        Employee employee1=new Employee(person2,20000,"2018-04-21","University");
        Faculty faculty1=new Faculty(employee1,person2,6,4);
        Staff staff1=new Staff(employee1,person2,"Professor");
        
        System.out.println(person1.toString());
        System.out.println(student1.toString());
        System.out.println(employee1.toString());
        System.out.println(faculty1.toString());
        System.out.println(staff1.toString());
    }
    
}
