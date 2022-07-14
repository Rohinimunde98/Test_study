package interface_study;

public class Interface_class extends MyInterface{

	public static void main(String[] args) {
		
	//System.out.println(a);  ----> calling to data,variable is not possible to interface these are by default final static and final

		Interface_class In=new Interface_class();    //creating a object of interface class
		
		In.m1();
		In.m2();
		In.m3();
	}
		
		public void m1()//providing defination to incomplete methods of interface
		{
			System.out.println("method m1 is belongs to interface class");
		}
		
		public void m2()//providing defination to incomplete methods of interface
		{
			System.out.println("method m2 belong to interface class");
		
		
	}
		public void m3()//own method of implementation class
		{
			System.out.println("method m3 completed in implementation class");
		}

}
