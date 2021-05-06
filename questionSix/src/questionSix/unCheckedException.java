/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionSix;

/**
 * unchecked exception
 *
 * @author Tejaswi Avula
 */
public class unCheckedException {

    int a = 0;
    int b = 0;
    String s = null;
    String s1 = null;

    /**
     * constructor
     *
     * @param a
     * @param b
     * @param s
     */
    public unCheckedException(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    /**
     * arithmeticException
     */
    public void arithemeticException() {

        try {

            int output = a / b;
            System.out.println("Result: " + output);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception has been caught");
        }

    }

    /**
     * method sting index out of bound exception
     */
    public void stringIndexOutOfBoundsException() {
        try {
            //String str="beginnersbook";
            System.out.println(s.length());
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(22));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException has occured");
        }
    }

}
