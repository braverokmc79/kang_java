package com.eightcruz.javastudy;

public class GetMean {

	public int getMean(int[] array){	
		int sum=0;
		for(int i=0; i<array.length; i++){
			sum +=array[i];
		}
		return sum/array.length;
	}
	
	public static void main(String[] args) {
		GetMean ex = new GetMean();

		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(ex.getMean(array));
	}
}
