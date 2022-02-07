package Mapping;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Shorts {

	public static void main(String[] args) 
	{
		Map<Short, Integer> m1=new TreeMap<Short,Integer>();
		short[] arr={500,200,200,200,500,500,98,98,98};
		for (short s : arr)
		{
			if (!m1.containsKey(s))
			{
				m1.put(s, 1);
			} else 
			{
				int count=m1.get(s);
				m1.put(s, count+1);
			}
		}
		for (Entry<Short, Integer> s1 : m1.entrySet()) 
		{
			System.out.println(s1.getKey()+" "+s1.getValue());
		}

	}

}
