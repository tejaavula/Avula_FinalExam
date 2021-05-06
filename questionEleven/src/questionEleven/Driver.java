/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionEleven;

/**
 *
 * @author Tejaswi Avula
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating the Objects of Insta class.

        facebook g1 = new facebook("teja", 4678);
        facebook g2 = new facebook("teja", 4678);
        facebook g3 = new facebook("krishna", 2465);
        System.out.println("***.equals***");
        System.out.println(g1.equals(g2));//it compares the inner content 
        System.out.println(g2.equals(g3));//it compares the inner content 
        System.out.println(g3.equals(g1));//it compares the inner content 
        System.out.println(g1.equals(g1));//it compares the inner content 
        System.out.println("***==***");
        System.out.println(g1 == g2);//it compares the references
        System.out.println(g2 == g3);//it compares the references
        System.out.println(g3 == g1);//it compares the references
        System.out.println(g1 == g1);//it compares the references
        System.out.println("*****hashcode*****");
        System.out.println(g1.hashCode());
        System.out.println(g2.hashCode());
        System.out.println(g3.hashCode());
        System.out.println("****address of the particular instances****");
        System.out.println(Integer.toHexString(System.identityHashCode(g1)));
        System.out.println(Integer.toHexString(System.identityHashCode(g2)));
        System.out.println(Integer.toHexString(System.identityHashCode(g3)));
        // comparing above created Objects.

        if (g1.hashCode() == g2.hashCode()) {
            if (g1.equals(g2)) {
                System.out.println("Both Objects are equal. ");
            } else {
                System.out.println("Both Objects are not equal. ");
            }

        } else {
            System.out.println("Both Objects are not equal. ");
        }

    }

}
