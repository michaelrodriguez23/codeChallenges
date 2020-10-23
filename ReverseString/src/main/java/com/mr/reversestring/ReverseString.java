/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.reversestring;

/**
 *
 * @author michaelrodriguez
 */
public class ReverseString {

    public static void main(String[] args) {
        String r = reverse("dog");
        System.out.println(r);
    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()]; // Array length
    
        
        
        for (int i = s.length() - 1; i >= 0; i--) {
            s.charAt(i); 
           System.out.println(s.charAt(i));
 
        } return s;
    }


}
