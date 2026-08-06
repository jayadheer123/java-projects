package vectorandarraylist;

import java.util.*;


public class TimeCheck {
	//static long end;
//static long start;

	public static void main(String[] args) {
		// long end;
		 //long start;
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		LinkedList<Integer> ll= new LinkedList<>();
		//long start = System.nanoTime();
		for(int i=0;i<7000;i++)
		{
			ar.add(i);
		}
		
		long start = System.nanoTime();
		//ar.remove(5000);
		ar.add(0,777);
		
		 long end = System.nanoTime();
		
		System.out.println("execution time :"+(end-start) );
		
		// start = System.nanoTime();
		
		for(int i=0;i<7000;i++)
		{
			ll.add(i);
			
		}
		
		 start = System.nanoTime();
		//ll.remove(5000);
		ll.add(0,888);
		
		end = System.nanoTime();
		
		System.out.println("LinkedList execution time :" +(end-start));
		
		System.out.println(ar);
		System.out.println(ll);
		
	}

}
