/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Nathan loves cycling.

Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java
 */
package com.mr.keephydrated;

/**
 *
 * @author michaelrodriguez
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Liters(11.8))
                ;
    }
    
  public static int Liters(double time)  {
      
      int wph =(int) Math.floor(time/2)
;    
  return wph; 
  }
    
}
