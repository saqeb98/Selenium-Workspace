package SeleniuemAssignment;


import java.util.Map.Entry;
import java.util.TreeMap;


public class Assignment1 {

	public static void main(String[] args) 
	{
		TreeMap<String, Integer> t1=new TreeMap<String,Integer>();
		String[] arr={"hello","hello","java","java"};
		for (String s1 : arr) 
		{
			if (!t1.containsKey(s1))
			{
				t1.put(s1,null);
			}
		}
		for (Entry<String, Integer> s : t1.entrySet()) 
		{
			System.out.print(s.getKey()+" ");
		}
	}

}
