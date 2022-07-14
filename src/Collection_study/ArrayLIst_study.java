package Collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLIst_study {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Velocity");
		al.add('A');
		al.add("Velocity");
		al.add(null);
		al.add(null);
		al.add(123);
		al.add(123.13);
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Velocity"));
		System.out.println(al.get(2));
		System.out.println(al.indexOf('A'));
		System.out.println(al.remove(2));
		System.out.println(al);
		al.add(2, "Pune");
		System.out.println(al);
		
		//1) for loop
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("============================");
		
		Iterator it = al.iterator();
		
		//2)Using while loop
		while(it.hasNext())
		{
		
       System.out.println(it.next());
	}
   System.out.println("========================");
   
   //3)Using ListIterator
   
 
ListIterator lit = al.listIterator();

     while(lit.hasNext()) {
	System.out.println(lit.next());
}
     System.out.println("===============");
     
     //4)for loop By using Object
     
    for(Object h:al) {
    	System.out.println(h);
    }
    System.out.println("=============");
    //By using ArrayLIst for Integer
    
    ArrayList<Integer>at=new ArrayList<>();
    
    at.add(1);
    at.add(10);
    at.add(20);
   for(Integer r:at) {
	   System.out.println(r);
   }
	System.out.println("===========");
	
	//ArrayList By using Char
	
	ArrayList<Character>ac=new ArrayList<>();
	
	ac.add('a');
	ac.add('A');
	ac.add('C');
	
	for(Character a:ac) {
		System.out.println(a);
	}
	System.out.println("============");
	//Array by using String
	ArrayList<String>st=new ArrayList<>();
	st.add("Shubham");
	st.add("Rohith");
	st.add("Kiran");
	
	System.out.println(st);
}
}
