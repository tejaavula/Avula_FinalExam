/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Tejaswi Avula
 */
public class exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int x = keyboard.nextInt();
            System.out.println("Enter another number");
            int y = keyboard.nextInt();
            System.out.println("The value of " + x + "/" + y + "is" + (x / y));
        } catch (InputMismatchException e) {
            System.out.println("you enteres invalid integer");
        } catch (Throwable e) {
            System.out.println("some other issue had happend");
        }
    }

}
