package Mapping;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Doubles {

	public static void main(String[] args) {
		Map<Double, Integer> m1=new TreeMap<Double, Integer>();
		double[] arr={12.25,25.25,525,4};
		for (double d1 : arr)
		{
			if (!m1.containsKey(d1))
			{
				m1.put(d1, 1);
			} else 
			{
				int count=m1.get(d1);
				m1.put(d1, count+1);
			}
		}
		for (Entry<Double, Integer> d2 : m1.entrySet())
		{
			System.out.println(d2.getKey()+" "+d2.getValue());
		}
	}

}
