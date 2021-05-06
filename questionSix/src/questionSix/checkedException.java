/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionSix;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tejaswi Avula
 */
public class checkedException {

    /**
     * method file not found exception
     */
    public void fileNotFoundException() {
        File file = new File("nofile.txt");
        try {

            FileInputStream sc1 = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            //Any file not found exceptions by the Scanner sc1 will be caught here
            System.out.println("File Not Found");

        }
    }

    /**
     * method class not found exception
     */
    public void classNotException() {
        try {

            Class.forName("questionSix.unCheckedException");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found");
        }
    }

}
