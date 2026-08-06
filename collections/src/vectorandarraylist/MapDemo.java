package vectorandarraylist;


import java.util.*;



public class MapDemo {
	

	public static void main(String[] args) {
		
		Map<Integer,String> ma= new LinkedHashMap<>();
		
		ma.put(561, "jaya");
		ma.put(557, "jash");
		ma.put(562, "denaid");
		ma.remove(561);
		ma.remove(562,"denaid" );
		
		System.out.println(ma.containsKey(564));
	System.out.println(ma.containsValue("arun"));
	
	ma.put(564, "arun");
	ma.putIfAbsent(564, "jaya dheer");
		for(String retrive : ma.values())
		{
		
		System.out.println(retrive);
		}
		
		System.out.println();
		for(Integer retrive: ma.keySet())
		{
			System.out.println(retrive);
		}
		
	
		
		      
		
		System.out.println(ma.size());
		//System.out.println(ma);
		

	}

}
