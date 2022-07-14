package Collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_study {

	private static final boolean Object = false;

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add("Pune");
		l.add("Pune");
		l.add(null);
		l.add(null);
		l.add(12.30);
		l.add('A');
		l.add(true);
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.peek());                        //Represent head element in the list
		System.out.println(l);
		l.add(160);                                                      //add info into arraylist
		System.out.println(l.pop());                       //remeove head element and returns the first element in tha list
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.remove());                  //remove the head element of the list
		System.out.println(l);
		l.add("rahul");
		
		
		System.out.println("===================");
		//1)for loop
		for(int i=0;i<=l.size()-1;i++)
		{
           System.out.println(l.get(i));
           
	}
		System.out.println("===================");
		
		//2)Ilterator
	Iterator it = l.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("=================");
	
	//ListIlterator
        ListIterator Lit = l.listIterator();
        while(Lit.hasNext())
        {
        	System.out.println(Lit.next());
        }
        System.out.println("===============");
        
        //for each
       for(Object eh:l){
    	   System.out.println(eh);
        	
        }
       System.out.println("================");
       
       LinkedList<Float>l1=new LinkedList<>();
       
       l1.add(12.3f);
       l1.add(34.2f);
       System.out.println(l1);
       System.out.println("=======================");
       
       LinkedList<Integer>l2=new LinkedList<>();
       l2.add(234);
       l2.add(390);
       
       for(Integer lp:l2)
       {
    	   System.out.println(lp);
       }
       System.out.println("===========");
       LinkedList<String>l3=new LinkedList<>();
       l3.add("NAshik");
       l3.add("Komal");
       
       for(String a:l3) {
    	   System.out.println(a);
       }
       System.out.println("===========");
     
       System.out.println(l3.poll());
     
	}
       
       
	}
	

