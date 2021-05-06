/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * Car 
 * @author Tejaswi Avula
 */
public class car extends vehicle implements movable, drivable {

    private String brand;

    /**
     * constructor
     * @param brand
     */
    public car(String brand) {
        this.brand = brand;
    }

    /**
     * overrided the stop
     */
    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * overrided the accelerate
     */
    @Override
    public void accelerate() {
        System.out.println("accelerate the car");
    }

    /**
     * overrided the decelarate
     */
    @Override
    public void decelerate() {
        System.out.println("decelerate the car");
    }

    /**
     * overrided the drive
     */
    @Override
    public void drive() {
        System.out.println("drive the car");
    }

    /**
     *  no of hours they can drive
     */
    @Override
    public void noOfhoursDrive() {
        System.out.println("drive for 5 hrs");
    }

    /**
     * start
     */
    @Override
    public void start() {

        System.out.println("This is car class ");
    }

}