/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleOne;

/**
 *
 * @author Tejaswi Avula
 */
public class searchElement {

    public static int lst[] = {15, 18, 28, 4, 78};

    // Method to search a element in list recursively
    public static int searchRecursively(int lst[], int low, int high, int data) {
        if (high < low) {
            return -1;
        }
        if (lst[low] == data) {
            return low;
        }
        if (lst[high] == data) {
            return high;
        }
        return searchRecursively(lst, low + 1, high - 1, data);
    }

}
