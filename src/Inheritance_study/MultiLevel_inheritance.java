package Inheritance_study;

public class MultiLevel_inheritance {

	public static void main(String[] args) {
		son_ s = new son_();// object of child class can call all properties
		s.keys();// properties of super most class
		s.recipe(); // properties of super most class
		s.Home();// properties of super class
		s.money();// properties of super class
		s.mobile();// properties of own class 
		s.laptop();//properties of own class
		
		mother_ m = new mother_();// object of super class can call own and its super class properties
		m.keys();// properties of super class
		m.recipe();// properties of super class
		m.Home();//properties of own class
		m.money();//properties of own class
		
		GrandMother g= new GrandMother();// object of supermost classs
		g.keys();// can call its own properties only
		g.recipe();// can call its own properties only


	}

}
