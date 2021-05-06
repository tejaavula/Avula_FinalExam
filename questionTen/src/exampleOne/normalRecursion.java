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
public class normalRecursion {
    // Method to depict normal recursion

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
