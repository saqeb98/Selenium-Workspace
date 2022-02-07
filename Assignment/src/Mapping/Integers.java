package Mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
		int[] arr={100,200,300,400,500,500,400,300,200,100};
		int count=0;
		for (int  i : arr) 
		{
			if (!m1.containsKey(i)) 
			{
				m1.put(i, 1);
			} else 
			{
				count=m1.get(i);
				m1.put(i, count+1);
			}
		}
		for (Entry<Integer, Integer> i1 : m1.entrySet())
		{
			System.out.println(i1.getKey()+" "+i1.getValue());
		}
	}

}
