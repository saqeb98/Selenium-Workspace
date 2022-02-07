package Problmes1;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Eachcharrep 
{
	static void charCount(String input)
	{
		LinkedHashMap<Character, Integer> l1=new LinkedHashMap<Character,Integer>();
		char[] ch=input.toCharArray();
		for (char c1 : ch)
		{
			if (!l1.containsKey(c1)) 
			{
				l1.put(c1, 1);
			} 
			/*else 
			{
				int count=l1.get(c1);
				l1.put(c1, count+1);
			}*/
		}
		for (Entry<Character, Integer> l2 : l1.entrySet()) 
		{
			System.out.println(l2.getKey()+" "+l2.getValue());
		}
	}
	public static void main(String[] args) 
	{
		String s1="india";
		charCount(s1);
			
	}
	}

