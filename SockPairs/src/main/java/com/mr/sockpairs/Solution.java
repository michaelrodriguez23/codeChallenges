/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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