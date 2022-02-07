package Mapping;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Floats {

	public static void main(String[] args) {
		Map<Float, Integer> m1=new TreeMap<Float,Integer>();
		float[] arr={32.23f,23.23f,23.23f,23.23f};
		int count=0;
		for (float f1 : arr) 
		{
			if (!m1.containsKey(f1))
			{
				m1.put(f1, 1);
			} else 
			{
				count=m1.get(f1);
				m1.put(f1, count+1);
			}
		}
		for (Entry<Float, Integer> f2 :m1.entrySet())
		{
			System.out.println(f2.getKey()+" "+f2.getValue());
		}

	}

}
