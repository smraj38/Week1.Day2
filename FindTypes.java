package WEEK1.DAY2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] str1 = test.toCharArray();

		for (int i = 0; i < str1.length; i++) {
			if (Character.isLetter(str1[i])) {
				letter++;
			}

			else if (Character.isDigit(str1[i])) {
				num++;
			}

			else if (Character.isSpaceChar(str1[i])) {
				space++;
			} else {

				specialChar++;
			}

		}
		System.out.println("Letters:" + letter);
		System.out.println("Digits:" + num);
		System.out.println("Spaces:" + space);
		System.out.println("Special Character:" + specialChar);

	}

}