/*
https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java
 */
package com.mr.firstnonconsequetive;

/**
 *
 * @author michaelrodriguez
 */
public class solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8};
        find(array);
    }

    static Integer find(final int[] array) {
        // iterate through array
        // if the current index - prev index != 1 then its non consequtive
        //else keeping looping until ...
        // if all nums are conseq then return null 
        int temp;
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }
        return null;
    }
}
