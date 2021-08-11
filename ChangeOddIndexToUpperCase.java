package WEEK1.DAY2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="changeme";
		char[] a=str.toCharArray();
		for (int i = 0; i<=a.length; i++) {
		if(i%2!=0)
			{
				System.out.println(Character.toUpperCase(a[i]));
			}
			
		}
	}
}