/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 * Square
 *
 * @author Tejaswi Avula
 */
public class Square extends GeometricObject implements Colorable {

    private double side;

    /**
     * constructor
     *
     * @param side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * side
     *
     * @return
     */
    public double getSide() {
        return side;
    }

    /**
     * sides
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Area
     *
     * @return
     */
    @Override
    public double getArea() {

        return side * side;

    }

    /**
     * overrided the color
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}
