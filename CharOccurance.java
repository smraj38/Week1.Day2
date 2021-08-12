package WEEK1.DAY2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";

// converting the String to Char array
		char[] str1 = str.toCharArray();

		int s = 0;

		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == 'e') {
				s = s + 1;
				System.out.println(s);
			}
		}
	}
}