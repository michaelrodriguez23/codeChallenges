/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.singlenumber1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 
/**
 *
 * @author michaelrodriguez Given a non-empty array of integers nums, every
 * element appears twice except for one. Find that single one.
 *
 * Follow up: Could you implement a solution with a linear runtime complexity
 * and without using extra memory?
 * @author michaelrodriguez
 */
public class solution {
    class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int anInt:nums){
          mySet.add(anInt);
        }
        ArrayList<Integer> intList = new ArrayList<>(mySet);
        int answer = intList.get(0); 
        System.out.println(answer);
    return answer;
  }
}
    
}
