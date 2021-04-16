/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Amulya Mallepalli
 */
public class Loan {
    int principle,time,rateOfInterest;
    String borrowerName;
    float interest,amount;
    
    Loan(int principle,int time,int rateOfInterest,String borrowerName){
        this.principle=principle;
        this.time=time;
        this.rateOfInterest=rateOfInterest;
        this.borrowerName=borrowerName;
        this.interest=(principle*time*rateOfInterest)/100;
        this.amount=this.principle+this.interest;
        
    }
    
    public String toString(){
        return "Loan [principle=" +principle+ ",time="+time+",rateOfInterest="+rateOfInterest+",borrowerName="+borrowerName+",interest="+interest+",amount="+amount+"]";
        
    }   
}
