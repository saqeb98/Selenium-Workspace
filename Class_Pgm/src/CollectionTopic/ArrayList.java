package CollectionTopic;



public class ArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		java.util.ArrayList l1=new java.util.ArrayList();
		
		l1.add('A');
		l1.add(1);
		l1.add("hello");
		l1.add('B');
		l1.add(2);
		l1.add("java");
		l1.add("pyhton");
		
		//System.out.println(l1);
		@SuppressWarnings("rawtypes")
		java.util.ArrayList l2=new java.util.ArrayList();
		
		l2.add("Java");
		l2.add("python");
		l2.add("c++");
		l2.add("c#");
		
		//l1.addAll(l2);    //Add all adds l1&l2
		//System.out.println(l1);
		//l1.remove(1);      //remove with index
		//System.out.println(l1);
		//l1.removeAll(l2);  //remove all duplicates from l1
		//System.out.println(l1);
		l1.retainAll(l2);
		System.out.println(l1);
	}

}
