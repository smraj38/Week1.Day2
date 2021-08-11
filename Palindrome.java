package WEEK1.DAY2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		String r="";
		for (int i = str.length()-1; i>=0; i--) {
			r= r+str.charAt(i);
		}
		
		if (str.equals(r)) {
			System.out.println("Palindrome");
			
		}
	}
}