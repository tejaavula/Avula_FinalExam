/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionTwelve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Tejaswi Avula
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> last = new ArrayList<Employee>();
        Employee e1 = new Employee(13456, "Teja", 100000);
        Employee e2 = new Employee(22347, "Mahitha",7000000);
        Employee e3 = new Employee(46757, "krishna", 500000);
        Employee e4 = new Employee(23456, "sekhar", 300000);
        Employee e5 = new Employee(34678, "Chandra",200000);
        last.add(e1);

        last.add(e2);
        last.add(e3);
        last.add(e4);
        last.add(e5);

        System.out.println("****After adding to the list*****");
        printEmployees(last);

        Collections.sort(last);
        System.out.println("****After sorting in normal ordering****");
        printEmployees(last);
        Collections.sort(last, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() == e2.getEmpSalary()) {
                    return 0;
                } else if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                } else {
                    return -1;
                }

            }

        });

        System.out.println("****After overriding normal ordering by empSalary****");
        printEmployees(last);

        Collections.sort(last, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                 if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) 
                   
                     return e1.getEmpName().compareTo(e2.getEmpName());
                 return e1.getEmpName().compareTo(e2.getEmpName());
               }

        });
        System.out.println("****After overriding normal ordering by  empName****");
        printEmployees(last);
    }

    private static void printEmployees(ArrayList<Employee> eList) {
        for (Employee e : eList) {
            System.out.println(e);
        }

    }
    
}
