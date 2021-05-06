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
public class facebook {

    public String name;
    public int id;

    public facebook(String name, int id) {
        this.name = name;

        this.id = id;
    }

    @Override

    public boolean equals(Object obj) {

        // checking if both the object references are referring to the same object.
        if (this == obj) {
            return true;
        }
        // it checks if the argument is of the type facebook by comparing the classes of the passed argument and this object.
        // if(!(obj instanceof facebook)) return false; ---> avoid.
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        // type casting of the argument.

        facebook fb = (facebook) obj;
        // comparing the state of argument with the state of 'this' Object.

        return (fb.name == this.name && fb.id == this.id);

    }

    @Override

    public int hashCode() {
        // We are returning the fb_id as a hashcode value.
        // we can also return some other calculated value or may be memory address of the Object on which it is invoked.
        //it depends on how you implement hashCode() method.
        return this.id;

    }

}
