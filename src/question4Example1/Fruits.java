/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4Example1;

/**
 *
 * @author Amulya Mallepalli
 */
public class Fruits {
    private int weight;

    public Fruits(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruits [" + "weight=" + weight + ']';
    }
    
    
}
