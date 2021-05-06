/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

/**
 *
 * @author Tejaswi Avula
 */
public class exception {

    /**
     * @param args the command line arguments
     */
    static void myWay() throws ArithmeticException, NumberFormatException {

        int x = 12;
        int y = 0;
        if (y == 0) {
            throw new ArithmeticException("Arithmetic Exception");
        }
        x = Integer.parseInt(null);
        throw new NumberFormatException("NumberFormat Exception");

    }

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            myWay();

        } catch (Exception x) {
            System.out.println(x);
        }

    }
}
