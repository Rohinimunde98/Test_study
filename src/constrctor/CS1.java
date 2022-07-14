package constrctor;

public class CS1 {
	// example of default constructor
//		public CS1() ---> default constructor provided by compiler
//		{
//			
//		}

		public static void main(String[] args) {
			
			CS1 c= new CS1();
			c.display();

		}
		
		public void display()
		{
			
			System.out.println("I am display method i am non static");
		}

}
