package vectorandarraylist;

import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();
		
		st.push("arun");
		st.push("jaya");
		st.push("jai");
		
		
		
		System.out.println(st.peek());
		
		//System.out.println(st.pop());
		System.out.println(st.search("arun"));
		
		
		
		
		
				
System.out.println(st);
	}

}
