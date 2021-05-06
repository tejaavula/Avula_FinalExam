/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

import static exampleOne.searchElement.lst;
import static exampleOne.searchElement.searchRecursively;

/**
 *
 * @author Tejaswi Avula
 */
public class searchElementDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data = 345;

        //Calling the function to find data
        int i = searchRecursively(lst, 0, lst.length - 1, data);
        if (i != -1) {
            System.out.println("Element " + data + " is present at index " + i);
        } else {
            System.out.println("Element " + data + " is not present in list");
        }
    }

}
