/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author Tejaswi Avula
 */
public abstract class vehicle {
    private String vName;

    /**
     * It is a method start in vehicle
     */
    public void start() {
        System.out.println("This vehicle starts");
    }

    /**
     * It is a abstract method stop
     */
    public abstract void stop();
}
