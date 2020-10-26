/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.areyouplayingbanjo;

/**
 *
 * @author michaelrodriguez
 * Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:
* https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java
 */
public class Banjo {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Reina"));
    }
        
  public static String areYouPlayingBanjo(String name) {
      String firstLetter = name.substring(0, 1);

 
    if(firstLetter.equalsIgnoreCase("R")){
        return name + " plays banjo";
  }
    else {
        return name + " does not play banjo";
    }

        
    }
    
}
