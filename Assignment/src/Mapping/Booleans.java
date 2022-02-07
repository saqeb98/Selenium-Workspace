package Mapping;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.TreeMap;

public class Booleans {

	public static void main(String[] args) {
		Map<Boolean, Integer> m1=new LinkedHashMap<Boolean, Integer>();
		boolean[] arr={true,false,true,false,true,false,false};
		int count=0;
		for (boolean b1 : arr) 
		{
			if (!m1.containsKey(b1))
			{
				m1.put(b1, 1);
			} else 
			{
				count=m1.get(b1);
				m1.put(b1, count+1);
			}
		}
		for (Entry<Boolean, Integer> b2 : m1.entrySet())
		{
			if (b2.getValue()>=count) 
				
			{
			System.out.println(b2.getKey()+" "+b2.getValue());
		}
		}

	}

}
