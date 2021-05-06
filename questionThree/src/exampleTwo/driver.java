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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        flower flower = new flower();
        roseFlower rf = new roseFlower();

        System.out.println(flower.color());
        System.out.println(flower.fragrance());

        System.out.println("\n***Implicit Casting***");
        flower = rf;  // subclass to parent class, it is valid
        System.out.println(flower.color());
        System.out.println(flower.fragrance());

        System.out.println("\n***Explicit Casting***");
        rf = (roseFlower) flower;// explicit casting
        System.out.println(flower.color());
        System.out.println(flower.fragrance());
    }

}
