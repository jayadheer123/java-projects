package vectorandarraylist;

import java.util.ArrayList;

public class Arrlist {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
	al.add("jaya dh");
	al.add("jaya");
	al.add("arun kumar");
	al.add( "guru");
	System.out.println(al.size());
	//System.out.println(al.ensureCapacity(10));
System.out.println(al);

String greatest= "";
for(int i=0;i<al.size();i++)
{
	if(al.get(i).length()>greatest.length())
	{
		
		 greatest=al.get(i);
		
	
                                                           // if(al.get(i).startsWith("j"))
	}		
}
System.out.println(greatest);

}
	}


                                                              //al.remove(i);
                                                           //i--
