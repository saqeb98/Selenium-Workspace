package Mapping;

import java.util.Map;
import java.util.TreeMap;

public class Char {

	public static void main(String[] args) 
	{
		Map<Character, Integer> m1=new TreeMap<Character, Integer>();
		char[] arr={'A','B','C','D','C','C','C','C','A'};
		for (char c1 : arr)
		{
			if (!m1.containsKey(c1)) 
			{
				m1.put(c1, 1);
			} else 
			{
				int count=m1.get(c1);
				m1.put(c1, count+1);
			}
			
		}
		for (java.util.Map.Entry<Character, Integer> c2 : m1.entrySet())
		{
			System.out.println(c2.getKey()+" "+c2.getKey());
		}
	}

}
