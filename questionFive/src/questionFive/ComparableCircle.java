/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionFive;

/**
 * ComparableCircle class
 *
 * @author Tejaswi Avula
 */
public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    /**
     * constructor
     *
     * @param radius
     */
    public ComparableCircle(double radius) {
        super(radius);
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * to string of comparable circle
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }

}
