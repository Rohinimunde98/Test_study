package Collection_study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {

		Vector v=new Vector();
		
		v.add("Pune");
		v.add('M');
		v.add(null);
		v.add(12.4);
		v.add(true);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		//System.out.println(v.remove(0));
		System.out.println(v);
		System.out.println(v.get(4));
		
		System.out.println("================");
		//1)for loop for vector
		for(int i=0;i<=v.size()-1;i++) {
			
			System.out.println(v.get(i));
		}
    System.out.println("=====================");
    
    //2)Ilterator
    Iterator ve = v.iterator();
    
    while(ve.hasNext()) {
    	
    	System.out.println(ve.next());
    }
    System.out.println("================");
    
    //3)ListIlterator using
    
    ListIterator lit= v.listIterator();
    
    while(lit.hasNext()) {
    	
    	System.out.println(lit.next());
    }
    System.out.println("=================");
    
    //4)Enumeration
   Enumeration el = v.elements();
   
   while(el.hasMoreElements()) {
	   System.out.println(el.nextElement());
   }
	}
	

}
