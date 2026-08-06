package vectorandarraylist;
import java.util.*;



public class QueueDemo {
	//static int age;

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(5);
		pq.offer(7);
		pq.add(6);
		pq.add(2);
	pq.add(1);
	//System.out.println(pq.size());
		//pq.poll();
		//System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.size());
		
		for(int age=0;age<=50;age++)
		{
					if(age%2==0)
			{
				pq.add(age);
								
			}
			
		}
		System.out.println(pq);
			
			while(!pq.isEmpty())
			{
			System.out.println(pq.poll());	
			
			}
		//System.out.println(pq);
	}

	
	}
	


	


