package Mapping;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Longs
{
	public static void main(String[] args) {
		Map<Long, Integer> m1=new TreeMap<Long, Integer>();
		long[] arr={1110,24424,242,7,25254,4247,4,25,4,4,4,4,4,4,4,4,4,4,4};
		int count=0;
		for (long l1 : arr)
		{
			if (!m1.containsKey(l1))
			{
				m1.put(l1, 1);
			} else 
			{
				count=m1.get(l1);
				m1.put(l1, count+1);
			}
		}
		for (Entry<Long, Integer> l2 : m1.entrySet())
		{
			if (l2.getValue()>=count) 
			{	
				System.out.println(l2.getKey()+" "+l2.getValue());
			}
			
		}
		}
	}

