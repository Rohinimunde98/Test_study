package Logical_Programs;

import java.util.Scanner;

public class palidrome_String {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Plz enetr vale of String");
String org = sc.next();
String rev="";

for(int i=org.length()-1;i>=0;i--) {
	
	rev=rev+org.charAt(i);
}
System.out.println("Original Value of String is "+org);

System.out.println("Reverse Value of String is "+rev);

if(org.equals(rev)) {
	
	System.out.println("Given String is Palidrome");
}
else {
	System.out.println("Given String is not Palidrome");
	
}
	
	

	
	}
}
