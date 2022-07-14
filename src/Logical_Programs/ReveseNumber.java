package Logical_Programs;

public class ReveseNumber {

	public static void main(String[] args) {
		int num=123;
		
		 String StrNum = Integer.toString(num);
		 String rev="";
		 
		 for(int i=StrNum.length()-1;i>=0;i--) {
			 
			rev =rev+StrNum.charAt(i);
		 }
		 
		int revNum = Integer.parseInt(rev);
		
		System.out.println("Original Number is"+num);
		System.out.println("reverse Number is"+revNum);

		
	}

}
