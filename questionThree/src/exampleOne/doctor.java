/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

/**
 * doctor class
 *
 * @author Tejaswi Avula
 */
public abstract class doctor implements payable {

    private String name;
    private String ssn;

    /**
     * constructor
     *
     * @param name
     * @param ssn
     */
    public doctor(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    /**
     * getter name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setter name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter ssn
     *
     * @return
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * setter ssn
     *
     * @param ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name of Doctor: " + getName() + "\n"
                + "SSN of Doctor: " + getSsn() + "\n"
                + "Monthly Pay: " + calcMonthlyPay() + "\n"
                + "Monthly Tax: " + calcMonthlyTax() + "\n"
                + "Salary with Tax: " + salaryWithTax() + "\n";

    }
}
