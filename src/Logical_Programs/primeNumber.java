package Logical_Programs;

public class primeNumber {

	public static void main(String[] args) {
	//12---->2---->11
		int num=99;
		int count=0;
		
		for(int i=2;i<=num;i++)          //2,3,....10
		{
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==1) {
			
			System.out.println("Given number is not a prime number");
		}
		else {
			System.out.println("Given number is not a prime number");
		}
		
		System.out.println("======================");
		
		int num1=12;
		int count1=0;
		
		for(int j=2;j<=num1;j++) {
			
			if(num1%j==0) {
				count1++;
				break;
			}
			
			if(count1==1) {
				
				System.out.println("Given number is not a prime number");
			}
			else {
				System.out.println("Given number is not a prime number");
			}
			
		}

	}

}
