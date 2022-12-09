package com.mukul.leatcode.ArrayPractice.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/
//https://www.youtube.com/watch?v=o2WOhGSfx_8&ab_channel=Fraz
//1. Two Sum
//Easy
//
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
//Constraints:
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//
//Only one valid answer exists.
// 
//
//Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

public class Two_Sum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
	public static int[] twoSum(int[] nums, int target) {
			int[] result = new int[2];
	        int size = nums.length;
	        if(size == 2)
	        {
	            result[0] = 0;
	            result[1] = 1;
	            return result;
	        }
	        
	        for(int i=0;i<size; i++)
	        {
	            for(int j =i+1;j<size;j++)
	            {
	                if((nums[i] + nums[j]) == target)
	                {
	                    result[0] = i;
	                    result[1] = j;
	                }
	            }
	        }
	        return result;
	        }
	}
