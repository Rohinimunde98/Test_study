package Collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) {
	
		TreeSet ts=new TreeSet();
		
		ts.add("Rohini");
		System.out.println(ts.add("Rohini"));            //duplicate not allowed it gives to us boolean output FALSE
		
		//ts.add(130);    //------->       Non-homogeneous data not allowed CALSS CAST EXPECTION
		
		ts.add("pune");
		ts.add("rohan");
    
		//ts.add(null);--->  null values not allowed  NULL POINTER EXPECTION
		System.out.println("xyz");
		System.out.println("rahul");
		System.out.println("add");
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.add("laptop"));
		
		
		System.out.println("=============");
		//Iterator
		 Iterator it = ts.iterator();
		 
		 while(it.hasNext())
		 {
			 
		System.out.println(it.next());
		 }
		 System.out.println("==========");
		 //for each
		 
		 for(Object o:ts)
		 {
		
		System.out.println(o);
		
System.out.println("===============");
	}
		ArrayList<String>av =new ArrayList<>();
		
		av.add("Ramesh");
		av.add("deja");
		
		System.out.println(av);
	}
}
