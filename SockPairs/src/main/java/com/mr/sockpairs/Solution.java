/*
Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale.
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  socks with colors .
There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below. 
It must return an integer representing the number of matching pairs of socks 
that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers describing the colors  of the socks in the pile.
https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup 
*/
package com.mr.sockpairs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author michaelrodriguez
 */
public class Solution {
  public static void main(String[] args) {
    int ar [] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
  System.out.println(sockMerchant(9,ar));
  }
public static int sockMerchant(int n, int[] ar) {
  Set<Integer> socks = new HashSet<>();
   int pairs =0;
        Arrays.sort(ar);
     
        for(int i = 0; i<n; i++){
                if(!socks.contains(ar[i])){
                    socks.add(ar[i]);
                } else {
                  pairs++;
                  socks.remove(ar[i]);
                }
            }
            
        return pairs;
            
}
}