package mapping;

import java.util.TreeMap;

public class Sample1 {

	public static void main(String[] args) 
	{
		TreeMap<String,Integer> m1=new TreeMap<String,Integer>();
		String[] arr={"mango","apple","kiwi","avagado"};
		for (String s1 : arr)
		{
			if (!m1.containsKey(s1))
			{
				m1.put(s1,0);
			}
		}
		for (java.util.Map.Entry<String, Integer> m2: m1.entrySet())
		{
			System.out.println(m2.getKey());
		}

	}

}
