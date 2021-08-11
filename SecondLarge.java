package WEEK1.DAY2;

import java.util.Arrays;


public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,11,4,6,7};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] != i) {
				System.out.println("2nd Larget number is " + arr[arr.length-2]);
				break;
			}
		
		}
		
}
}
