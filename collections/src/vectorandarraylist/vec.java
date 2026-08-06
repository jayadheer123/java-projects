package vectorandarraylist;

import java.util.Arrays;
import java.util.Vector;


public class vec {
	
	
			public static void main(String[] args) {
				 Integer[] numbersAttended= new Integer[] {2,2,3,4,5};
		Vector<Integer> ve = new Vector<>(Arrays.asList(numbersAttended)); 
		
		ve.add(5);
		ve.add(7);
		Vector<Integer> ve1 = new Vector<>();
		ve1.addAll(ve);
		ve1.add(77);
		 ve1.add(7);
		 
		 ve.remove(1);
		 
		System.out.println(ve.containsAll(ve));
		
		
	System.out.println(ve.contains(1));
	
		System.out.println(ve.size());
		System.out.println(ve.capacity());
		
		System.out.println(ve);
		System.out.println(ve1);
	}

}

