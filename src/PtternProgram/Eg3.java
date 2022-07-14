package PtternProgram;

public class Eg3 {

	public static void main(String[] args) {
		//4!----->4*3*2*1=24
		int num=4;
		int fact=1;
		
		for(int i=num;i>=1;i--)       //4,3,2,1
		{
			
			fact=i*fact;
			
		}
		System.out.println("Factorial of num is "+fact);

		
		System.out.println("===================");
	
	
	//6!----->6*5*4*3*2*1=720
	
	int num1=6;
	int fact1=1;
	
	for(int i=num1;i>=1;i--) {
		fact1=i*fact1;
	}
	System.out.println("Fact of num1 is "+fact1);
	System.out.println("=================");
	
 
	}
}
