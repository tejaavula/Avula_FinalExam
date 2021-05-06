/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionFive;

/**
 * circle class
 * @author Tejaswi Avula
 */
public class Circle {
     private double radius;

    /**
     * constructor
     * @param radius
     */
    public Circle(double radius) {

        this.radius = radius;
    }

    /**
     * Return radius
     * @return 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * method
     * @return
     */
    public double getArea() {
        String result= String.format("%.2f", radius * radius * Math.PI);
        
        return Double.parseDouble(result);
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "radius=" + radius;
    }
}
