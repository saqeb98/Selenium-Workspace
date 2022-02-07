package CollectionTopic;

import java.util.Map;
import java.util.TreeMap;

public class ElementPresInArray 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> a1=new TreeMap<String,Integer>();
		String[] arr={"hello","hi","bye","ok","hello"};
		for (String r : arr) 
		{
			if (!a1.containsKey(r)) 
			{
				a1.put(r,1);
			}
			else{
				int count=a1.get(r);
				a1.put(r, count+1);
				}
		}
		for (java.util.Map.Entry<String, Integer> a :a1.entrySet())
		{
			if (a.getValue()>=2)
			{
				System.out.println(a.getKey()+" "+a.getValue());
			}
			
		}
	}

}
