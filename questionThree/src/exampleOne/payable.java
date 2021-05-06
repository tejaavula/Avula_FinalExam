/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

/**
 * payable
 * @author Tejaswi Avula
 */
public interface payable {
      
    /**
     * constant
     */
    public static final double PAY = 750.00;

    /**
     * monthly pay
     * @return
     */
    public abstract double calcMonthlyPay();

    /**
     * monthly tax
     * @return
     */
    double calcMonthlyTax();

    /**
     * included with the tax
     * @return
     */
    double salaryWithTax();
}
