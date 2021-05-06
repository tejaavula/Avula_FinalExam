/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleThree;

import java.io.IOException;

/**
 *
 * @author Tejaswi Avula
 */
public class exampleThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            throwsExample obj = new throwsExample();
            obj.myWay(6);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
