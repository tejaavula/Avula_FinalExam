/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

/**
 * half doctor class
 *
 * @author Tejaswi Avula
 */
public class halfDoctor extends doctor {

    /**
     * constructor
     *
     * @param name
     * @param ssn
     */
    public halfDoctor(String name, String ssn) {
        super(name, ssn);
    }

    /**
     * monthly pay
     *
     * @return
     */
    @Override
    public double calcMonthlyPay() {
        return 0.5 * PAY;
    }

    /**
     * monthly tax
     *
     * @return
     */
    @Override
    public double calcMonthlyTax() {
        return 0.07 * calcMonthlyPay();
    }

    /**
     * salary with tax
     *
     * @return
     */
    @Override
    public double salaryWithTax() {
        return calcMonthlyPay() - calcMonthlyTax();
    }
}
