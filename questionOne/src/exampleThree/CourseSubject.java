/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleThree;

/**
 *CourseSubject class implements the ComputerScience class
 * @author Tejaswi Avula
 */
public class CourseSubject implements ComputerScience{

    /**
     * overrided the course code
     * @param num
     */
    @Override
    public void getcoursecode(int num) {
        System.out.println("Java course " +num) ;
    }
   
}
