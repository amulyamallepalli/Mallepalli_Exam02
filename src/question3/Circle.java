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
public class Circle {
    int radius,diameter;
    double circumference,area;
    
    Circle(int radius){
        this.radius=radius;
        this.diameter=2*radius;
        this.circumference=2*radius*Math.PI;
        this.area=Math.PI*radius *radius;
        
    }
    public String toString(){
        return "Circle [radius="+radius+",diameter="+diameter+",circumference="+circumference+",area="+area+"]";
    }
}