 package Collection_study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Hashset_study {

	public static void main(String[] args) {
	
		HashSet hs=new HashSet();
		hs.add("pune");
		hs.add("pune");
		hs.add(null);
		hs.add(12.60);
		hs.add(12.4f);
		hs.add(null);
		hs.add('A');
		
		System.out.println(hs);
		System.out.println(hs.add("kiran"));
		System.out.println(hs.remove(3));
		System.out.println(hs.contains('A'));
		System.out.println(hs.isEmpty());
		
		
		System.out.println("====================");
		//1)for loop
		
		for(Object lo:hs) {
			
			System.out.println(lo);
		}
		System.out.println("=====================");
        Iterator it=hs.iterator();
        
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        for(Object o:hs) {
        	hs.clear();
        	hs.add("Pnakaj");
        	
        }
	}

}
