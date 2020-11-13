/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.singlenumber;

import java.util.HashMap;

/**
 *
 * @author michaelrodriguez Given a non-empty array of integers nums, every
 * element appears twice except for one. Find that single one.
 *
 * Follow up: Could you implement a solution with a linear runtime complexity
 * and without using extra memory?
 */
public class solution {
        

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 0,3,3,3};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int answer = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
          if(hm.containsKey(nums[i])){
              i++;
              counter ++;
          }else{
             
              hm.put(nums[i], counter+1);
              System.out.println(hm);
          }
          
        }
        return 0;
        }

    }
