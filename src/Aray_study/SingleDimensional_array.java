package Aray_study;

import java.util.Arrays;

public class SingleDimensional_array {

	public static void main(String[] args) {
		int money[]=new int[3];
		money[0]=5;
		money[1]=20;
		money[2]=30;
		
		
		for(int i=0;i<=2;i++) {
			System.out.println(money[i]);
			
		}
		System.out.println("==================");
		Arrays.sort(money);//inbulit method of Array
		System.out.println("sorted Array");
		for(int i=0;i<=2;i++) {
			System.out.println(money[i]);
		}
		System.out.println("=============");
		//decending order
		for(int i=2;i>=0;i--) {
			System.out.println(money[i]);
			System.out.println("===========");
		}
		String name[]= {"velocity","Pune"};
		System.out.println(name.length);
		System.out.println("============");
		
		int rollno[]= {1,2,3,4,5};
		System.out.println(rollno[3]);
		
		char Grade[]= {'a','c','f'};
		
		System.out.println(Grade[0]);
		
		

	}

}
