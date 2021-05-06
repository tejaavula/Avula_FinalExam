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
public class throwsExample {

    void myWay(int num) throws IOException, ClassNotFoundException {
        if (num == 6) {
            throw new IOException("IOException Occurred");
        } else {
            throw new ClassNotFoundException("ClassNotFoundException");
        }
    }
}
