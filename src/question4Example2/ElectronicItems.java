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
public class ElectronicItems {
    private String phones;

    public ElectronicItems(String phones) {
        this.phones = phones;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "ElectronicItems[" + "phones=" + phones + ']';
    }
    
    
    
}
