package CollectionTopic;


public class PriorityQueue 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		
		java.util.PriorityQueue p1=new java.util.PriorityQueue();
		p1.add(10);
		p1.add(35);
		p1.add(44);
		p1.add(51);
		p1.add(20);
		
		
		/*System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println(p1.peek());
		
		System.out.println();
		System.out.println("*****pool*****");
		System.out.println();
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
*/		
		java.util.PriorityQueue p2=new java.util.PriorityQueue();
		p2.add(11);
		p2.add(353);
		p2.add(455);
		p2.add(51);
		p2.add(20);
	//	System.out.println(p1.addAll(p1));
	/*	p1.retainAll(p2);
		System.out.println(p1);*/
		/*p1.removeAll(p2);
		System.out.println(p1);*/
		//System.out.println(p1.removeAll(p2));
		java.util.PriorityQueue p3=new java.util.PriorityQueue(p2);
		System.out.println(p3);
	}	
}
