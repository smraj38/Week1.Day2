package WEEK1.DAY2;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t1 = "stops";
		String t2 = "potss";

		int c1 = t1.length();
		int c2 = t2.length();
		char[] a = t1.toCharArray();
		char[] a1 = t2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(a1);

		if (c1 != c2) {
			System.out.println("Cant check Anagaram due to string length mismatch");
		}

		else if (Arrays.equals(a, a1)) {
			System.out.println("Anagaram");
		} else {
			System.out.println("not an Anagaram");
		}

	}

}
