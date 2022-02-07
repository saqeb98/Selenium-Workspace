package Assessment1;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Pg11 {
	static void charCount(String input)
	{
		LinkedHashMap<String, Integer> l1=new LinkedHashMap<String,Integer>();
		String[] s1=input.split(" ");
		//char[] ch=input.toCharArray();
		for (String s : s1)
		{
			if (!l1.containsKey(s)) 
			{
				l1.put(s, 1);
			}/* else 
			{
				int count=l1.get(s);
				l1.put(s, count+1);
			}*/
		}
		for (Entry<String, Integer> l2 : l1.entrySet()) 
		{
			System.out.println(l2.getKey());
		}
	}
	public static void main(String[] args) {
		String s1="hi hello welcome hello hi bangalore";
		charCount(s1);

	}

}
