/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Amulya Mallepalli
 */
public abstract class GeometricObject {
    private boolean filled;
    private String color;

    public abstract double getArea();
    public abstract double getPerimeter();
    
    public GeometricObject(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "filled=" + filled + ", color=" + color + '}';
    }

    
}
