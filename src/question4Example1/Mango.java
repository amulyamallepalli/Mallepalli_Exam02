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
public class Mango extends Fruits{
    private int cost;

    public Mango(int cost,int weight) {
        super(weight);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Mango[" + "cost=" + cost + ']';
    }
    
}
