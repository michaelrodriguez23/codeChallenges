/*
In this Kata, you will be given an array of numbers
in which two numbers occur once and the rest occur only twice. Your task will be 
to return the sum of the numbers that occur only once.
For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 
7 and 8 occur once, and their sum is 15. Every other number occurs twice.

https://www.codewars.com/kata/59f11118a5e129e591000134/train/java


Good luck!
 */
package com.mr.mavenproject3;

import java.util.HashMap;

/**
 *
 * @author michaelrodriguez
 */
public class Solution {
    public static void main(String[] args) {
         int [] arr = {1,2,4,9,2,3,4};
        System.out.println(repeats(arr));
    }
    public static int repeats(int[] arr){
        int pointA; 
        HashMap<Integer,Integer> mappy = new HashMap<Integer,Integer>();
        
        int length = arr.length;
        int sum = 0; 
        
        for(pointA = 0; pointA <= length; pointA++ ){
            // if the key already exist subtract the sum; t
     if(mappy.containsKey(arr[pointA])){
         sum -= arr[pointA];
        
            }
     else{
         mappy.put(arr[pointA], 1);
         sum+= arr[pointA];
     }
        }
        return sum;
    }    
        

    
   

}
