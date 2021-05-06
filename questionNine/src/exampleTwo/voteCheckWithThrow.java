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
public class voteCheckWithThrow {

    /**
     * @param args the command line arguments
     */
    static void checkVote(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("you are eligible to vote");
        }

    }

    public static void main(String[] args) {
        checkVote(13);
    }

}
