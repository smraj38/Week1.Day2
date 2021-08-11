package WEEK1.DAY2;

import java.util.Arrays;


public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8,7,6,4,3,2,1,0};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] != i) {
				System.out.println("missing element is " + i);
				break;
			}
		
		}
		
}
}
