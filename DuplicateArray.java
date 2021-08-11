package WEEK1.DAY2;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum={14,12,13,11,15,14,18,16,17,19,18,17,20};
           
		for(int i=0;i<=arrNum.length-1;i++)
		{
		for(int j=i+1;j<=arrNum.length-1;j++){
		 if(arrNum[i]==arrNum[j]){
		System.out.println(arrNum[j]);	
		}
		}
}
}	
}