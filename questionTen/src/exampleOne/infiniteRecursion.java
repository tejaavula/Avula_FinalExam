/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

import java.util.Scanner;

/**
 *
 * @author Tejaswi Avula
 */
public class infiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = a.nextInt();
        try {
            System.out.println(n * infiniteRec(n - 1));
        } catch (java.lang.StackOverflowError ex) {
            System.out.println("The Infinite Recursion" + " " + ex);

        }
    }

    private static int infiniteRec(int n) {
        return n * infiniteRec(n - 1);
    }
}
