/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.clock;

/**
 *
 * @author michaelrodriguez
 */
public class clock {

    public static void main(String[] args) {
        System.out.println(Past(1, 2, 3));
    }

    public static int Past(int h, int m, int s) {
        int millisec = 0;
        int hoursToMil = h * 3600000;
        int minToMil = m * 60000;
        int secToMil = s * 1000;

        if (h >= 0 && h <= 23 && m >= 0 && m <= 60 && s >= 0 && s <= 60) {
            return hoursToMil + minToMil + secToMil;

        } else {
            System.out.println("Invalid input");
            return 0;

        }
    }
}
