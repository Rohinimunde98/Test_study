package Pratice;

public class eg1 {

	public static void main(String[] args) {
		
		String a="I LOVE PUNE CITY";
		String[] ar = a.split(" ");
		
		
		
		for(int i=0;i<=ar.length-1;i++) {
			
			if(i%2!=0) {
				
				String s=ar[i];
				ar[i]=reverse(s);
			}
			
		}
		
		for(int i=0;i<=ar.length-1;i++) {
			
			System.out.println(ar[i]);
		}

	}
	
	public static String reverse(String inp) 
	{
		String rev="";
		for(int i=0;i<inp.length()-1;i++) {
			
			rev=rev+inp.charAt(i);
		}
		
		return rev;
		
		
	}

}
