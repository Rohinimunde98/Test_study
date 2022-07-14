package Abstract_study;

public class Abstract_test {

	public static void main(String[] args) {
		// as we cant create object of abstract class
				// creating object of concrete class
       concreate_study c=new concreate_study();
       c.test1();//method completed in Abstract class
       c.test2();//method completed in Abstract class
       c.test3();//method completed in Abstract class
       c.test4();//method completed in concrete class--> own method
       c.test5();//method completed in concrete class--> own method
	}

}
