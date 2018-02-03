package com.count.zero;



public class CountNumberOfZeroANDOneInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 0, 0, 1, 1,2,3,3 };
		int sum = 0;
		for (int value : arr) {
			sum += value;
		}
		
		int zeroCount = arr.length - sum;
		System.out.println("Count of zero:" + zeroCount);
		System.out.println("Count of one:" + sum);
		
		int result[]=new int[4];
		
		for(int i : arr)
		{
			result[i]=result[i]+1;
		}
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		
		
	}

}
