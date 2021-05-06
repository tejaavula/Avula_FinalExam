/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 * Driver class
 *
 * @author Tejaswi Avula
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// creating 5 objects 
        GeometricObject[] g = new GeometricObject[5];
        g[0] = new Square(1);
        g[1] = new Square(2);
        g[2] = new Square(3);
        g[3] = new Square(4);
        g[4] = new Square(5);
// calling area() for all the objects in array list
        for (int i = 0; i < g.length; i++) {
            System.out.printf("\n%d Geometricobject \n", i);
            System.out.printf("Area : %f\n", g[i].getArea());
            if (g[i] instanceof Colorable) {
                Colorable c = (Colorable) g[i];
                c.howToColor();
            }
        }
    }

}
