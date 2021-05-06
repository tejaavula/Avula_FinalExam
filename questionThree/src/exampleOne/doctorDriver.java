/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

/**
 * driver class
 *
 * @author Tejaswi Avula
 */
public class doctorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        doctor d = new fullDoctor(2, "John", "1243");
        //System.out.println(d);

        payable p1 = new halfDoctor("Willson", "6543");
        payable p2 = new fullDoctor(3, "zessica", "1234");

        //p1=p2;
        //System.out.println(p1);
        // assigning halfDoctor d instance to fullDoctor instance 
        p2 = p1;
        System.out.println(p2);
//assigning fullDoctor d instance to halfDoctor instance 
        p1 = d;
// typecasting halfDoctor instance to fullDoctor and without assigning in p1=d statement we will get wrror
        fullDoctor d2 = (fullDoctor) p1;
        System.out.println(d2);

        //primitive data type Casting
        double a = 13.5;
        double b = 6.6;
        // typecasting double to int
        System.out.println("divide a/b :" + (int) (a * (a / b)));
    }

}
