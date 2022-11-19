package com.mukul.interviewBit.ArrayPractice;

//Problem Description
//
//
//
//There is a corridor in a Jail which is N units long. Given an array A of size N. The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.
//
//All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].
//
//Initially all lights are off.
//
//Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.
//
//
//
//Problem Constraints
//1 <= N <= 100000
//
//1 <= B <= 10000
//
//
//
//Input Format
//First argument is an integer array A where A[i] is either 0 or 1.
//
//Second argument is an integer B.
//
//
//
//Output Format
//Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.
//
//
//Example Input
//Input 1:
//
//A = [ 0, 0, 1, 1, 1, 0, 0, 1].
//B = 3
//Input 2:
//
//A = [ 0, 0, 0, 1, 0].
//B = 3
//
//
//Example Output
//Output 1:
//
//2
//Output 2:
//
//-1
//
//
//Example Explanation
//Explanation 1:
//
//In the first configuration, Turn on the lights at 2nd and 7th index. Light at 2nd index covers from [ 1, 5] and light at 7th index covers [6, 8].
//
//
//
//Explanation 2:
//
//In the second configuration, there is no light which can light the first corridor.


public class MinimumLightsToActivate {

	public static void main(String[] args) {
		
		int[] A = {0, 0, 1, 1, 1, 0, 0, 1};
//		int[] A= {0, 0, 0, 1, 0};
		int B = 3;
		System.out.println(lights(A,B));
	}

	public static int lights(int[] a, int b) {
		int ans = 0;
		int n = a.length;
		boolean canLight=false;
		for(int i = 0; i<n;)
		{
			int r = Math.min((i+b-1),(n-1));
			int l = Math.max((i-b+1),0);
			while(r>=l)
			{
				if(a[r]==1) {
					canLight = true;
					break;
				}
				r--;
			}
			if(canLight == false)
				return -1;
			ans++;
			i=r+b;
		
		}
		return ans;
	}		
}

