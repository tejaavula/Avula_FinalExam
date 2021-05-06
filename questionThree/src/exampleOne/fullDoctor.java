/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

/**
 * fullDoctor
 *
 * @author Tejaswi Avula
 */
public class fullDoctor extends doctor {

    private int serviceyears;

    /**
     * constructor
     *
     * @param serviceyears
     * @param name
     * @param ssn
     */
    public fullDoctor(int serviceyears, String name, String ssn) {
        super(name, ssn);
        this.serviceyears = serviceyears;
    }

    @Override
    public String toString() {
        return super.toString() + "serviceyears=" + serviceyears + "\n*********************";
    }

    /**
     * overrided the monthly pay
     *
     * @return
     */
    @Override
    public double calcMonthlyPay() {
        return PAY;
    }

    /**
     * overrided the monthly tax
     *
     * @return
     */
    @Override
    public double calcMonthlyTax() {
        return 0.1 * calcMonthlyPay();
    }

    /**
     *
     * @return
     */
    @Override
    public double salaryWithTax() {
        return PAY - calcMonthlyTax();
    }

}
