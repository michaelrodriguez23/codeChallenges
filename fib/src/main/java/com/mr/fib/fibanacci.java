/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.fib;

/**
 *
 * @author michaelrodriguez
 */
public class fibanacci {

    public static void main(String[] args) {
        int input = 10;

        System.out.println(fib(input));

    }

    static int fib(int n) {
        // assume n is a positive integer.
        if(n>=3){ 
            return fib(n-1) + fib(n-2);
        }else { 
            return 1;
        }
  
}
}
