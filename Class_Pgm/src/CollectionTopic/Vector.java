package CollectionTopic;

public class Vector {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{

		@SuppressWarnings("rawtypes")
		java.util.Vector v1=new java.util.Vector();
		v1.add(21);
		v1.add(24);
		v1.add(24);
		v1.add("fsd");
		
		
		@SuppressWarnings("rawtypes")
		java.util.Vector v2=new java.util.Vector();
		v2.add('A');
		v2.add(24);
		v2.add(24);
		v2.add("fsd");
		
		//v1.remove(2);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		//v1.removeAll(v2);
		System.out.println(v1);
		//v1.retainAll(v2);
		System.out.println(v1);
		
		for (int i = 0; i < v1.size(); i++) 
		{
			Object a1=v1.get(i);
			System.out.println(a1);
		}
	}

}
