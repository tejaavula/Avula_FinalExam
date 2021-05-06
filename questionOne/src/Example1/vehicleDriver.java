/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * vehicle driver
 * @author Tejaswi Avula
 */
public class vehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        car c1 = new car("BMW");
        // this method will call car class start() not abstract class start()
        c1.start();
        //will call implemented method in car class
        c1.accelerate();
    }

}
