package Collection_study;



import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashlist_study {

		public static void main(String[] args) {
		
			LinkedHashSet lh=new LinkedHashSet();
			
			lh.add("Punam");
			lh.add('A');
			lh.add("Punam");
			lh.add(122);
			lh.add(45.6f);
			lh.add(null);
			
			System.out.println(lh);
			System.out.println(lh.isEmpty());
			System.out.println(lh.contains(lh));
			System.out.println(lh.remove(122));
			System.out.println(lh.add(150));
			
			System.out.println("=================");
			//for loop
		Iterator	it=lh.iterator();
		
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
		}
			
		//for each
		
		for(Object ob:lh) 
		{
		//	lh.clear();
			System.out.println(lh.isEmpty());
			System.out.println(lh.size());
			
		}
			
		
		
	

	}

}
