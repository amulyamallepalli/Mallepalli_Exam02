/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Amulya Mallepalli
 */
public class Question1Driver {

    public static void removeDup(ArrayList<Integer> myList){
        ArrayList<Integer> uniqueList =new ArrayList<Integer>();
        
        for(Integer i:myList){
            if(uniqueList.isEmpty()){
            uniqueList.add(i);
        }
            else if(!uniqueList.contains(i)){
                uniqueList.add(i);
        }else{
                //do nothing
            }
        }
        
        System.out.print("The distinct integers are " ); 
        for(Integer i:uniqueList)
            System.out.print(i+" ");
       
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ArrayList<Integer> myList = new ArrayList<Integer>();
      Scanner scan=new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for(int i=0;i<10;i++){
           myList.add(scan.nextInt());
    }
     Question1Driver.removeDup(myList);
}

}