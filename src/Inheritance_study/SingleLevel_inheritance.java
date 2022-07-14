package Inheritance_study;

public class SingleLevel_inheritance {

	public static void main(String[] args) {
		Mother m= new Mother();
		m.Home();
		m.money();
		
		System.out.println("========================");
		Son s= new Son(); // creating object of child class
		s.Home();// using superclass property
		s.money();//using superclass property
		s.mobile();//using own property
		s.laptop();//using own property



	}

}
