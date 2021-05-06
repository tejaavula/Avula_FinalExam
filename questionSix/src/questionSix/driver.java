/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionSix;

/**
 * driver class
 * @author Tejaswi Avula
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Checked Exceptions
        checkedException e = new checkedException();
        e.fileNotFoundException();
        e.classNotException();
        //unChecked Exceptions
        unCheckedException e2 = new unCheckedException(10,0, "Java Exam");
        e2.arithemeticException();
        e2.stringIndexOutOfBoundsException();
    }
    
}
