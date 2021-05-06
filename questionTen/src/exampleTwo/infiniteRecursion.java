/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleTwo;

/**
 *
 * @author Tejaswi Avula
 */
public class infiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void neverEnd() {
        System.out.println("This method never ends");
        neverEnd();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        neverEnd();
    }

}
