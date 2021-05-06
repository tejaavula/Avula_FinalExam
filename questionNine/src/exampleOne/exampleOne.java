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
public class exampleOne {

    /**
     * @param args the command line arguments
     */
    static void test() throws ArithmeticException {
        System.out.println("Inside the test function");
        throw new ArithmeticException("demo");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            test();
        } catch (ArithmeticException e) {
            System.out.println("caught" + e);
        }
    }
}
