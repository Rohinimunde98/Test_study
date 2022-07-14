package Polymorphison;

public class overriding_test {

	public static void main(String[] args) {
	 
		father f=new father();
		f.money();
		f.bike();
		f.laptop();
		
		 System.out.println("=============");
		son s=new son();
		s.money();
		s.bike();
		s.laptop();
        System.out.println("===================");
	}

}
