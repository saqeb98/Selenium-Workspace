package CollectionTopic;
//import java.util.LinkedList;
public class LinkedList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		java.util.LinkedList l1=new java.util.LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add('A');
		l1.add("all");
		l1.add(true);
		
		System.out.println(l1);
		

		@SuppressWarnings("rawtypes")
		java.util.LinkedList l2=new java.util.LinkedList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add('B');
		l2.add("all");
		l2.add(false);
		System.out.println(l2);
		System.out.println();
		
		
		
		
		
		
		
		
		for (int i = 0; i < l1.size(); i++) 
		{
			Object a1=l1.get(i);
			System.out.println(a1);
		}
		System.out.println();
		for (int i = 0; i < l2.size(); i++) 
		{
			Object a2=l1.get(i);
			System.out.println(a2);
		}
		System.out.println();
		//l1.addAll(l2);
		//System.out.println(l1);
		System.out.println();
		
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println();
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println();
		System.out.println(l2.poll());
		System.out.println(l2);
		System.out.println(l2.poll());
		System.out.println(l2);
		System.out.println();
		
		System.out.println("l1--> "+l1);
		l1.remove(2);
		System.out.println("l1--> "+l1);
		System.out.println("l2--> "+l2);
		l1.removeAll(l2);
		System.out.println("l1--> "+l1);
		System.out.println("l2--> "+l2);
		
	
	
	}
	
	

}
