package PtternProgram;

public class Eg2 {

	//*****                        
	//*****
	//*****
	
	//Rows=3
	//column=5
	//Always start with Rows outer loop
	public static void main(String[] args) {
		
		//outer loop for rows (count rows) Here rows=3
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=5;j++) {
			
			System.out.print(" *");           //------>Use Print only
		}
		System.out.println();                  //on next line use println
		
	}
		
		System.out.println("===================");
		
		//**********
		//**********
		//**********
		
		//row=3          ---->outer loop for rows 
		//colums=10       ----->inner loop for column
		
		
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=10;j++) {
				
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}
		
		System.out.println("===============");
		
		//========
		//========
		//========
		//row=3
		//colums=8
		
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=8;j++) {
				System.out.print(" = ");
				
			}
			System.out.println();
		}
	}
}
