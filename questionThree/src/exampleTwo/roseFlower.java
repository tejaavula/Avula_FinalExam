/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleTwo;

/**
 * roseflower class
 *
 * @author Tejaswi Avula
 */
public class roseFlower extends flower {

    /**
     * color
     *
     * @return
     */
    @Override
    public String color() {
        return "Rose is red in color";
    }

    /**
     * overrided the fragrance
     *
     * @return
     */
    @Override
    public String fragrance() {
        return "Rose flower has mild fragrance";
    }
}
