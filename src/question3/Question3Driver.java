/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Amulya Mallepalli
 */

    public class Question3Driver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date=new Date();
        Circle circle=new Circle(5);
        Loan loan=new Loan(20000,20,10,"Amulya M");
         String sample="Exam";
         
         List<Object> myList=new ArrayList<Object>();
         
         myList.add(loan);
         myList.add(date);
         myList.add(sample);
         myList.add(circle);
         
         for(Object obj: myList){
             System.out.println(obj.toString());
         }
   }
    
}
