/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.n.th_power;

/**
 *
 * @author michaelrodriguez
 */
//You are given an array with positive numbers and a number N. You should find the N-th power of the element in the array with the index N. If N is outside of the array, then return -1. Don't forget that the first element has the index 0.
//
//Let's look at a few examples:
//
//    array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
//    array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.
//https://www.codewars.com/kata/57d814e4950d8489720008db/train/java
public class solution {

    public static void main(String[] args) {
        int N = 3;
        int array[] = {1, 2, 35, 12};

        System.out.println(nthPower(array, N));
    }

    public static int nthPower(int[] array, int n) {

     if(n>= array.length){
         return -1;
        }
     else { 
         return (int)Math.pow(array[n], n);
     }
    }
}
