package Random1;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Tester2 {

	public static void main(String[] args) 
	{
		TreeMap<String, Integer> t1=new TreeMap<String,Integer>();
		String[] arr={"java","java","python","c++"};
		int count=0;
		for (String s1 : arr)
		{
			if (!t1.containsKey(s1))
			{
				t1.put(s1, 1);
			} else 
			{
				count=t1.get(s1);
				t1.put(s1, count+1);
			}
		}
		for (Entry<String, Integer> t2: t1.entrySet())
		{
			System.out.println(t2.getKey()+" "+t2.getValue());
		}

	}

}
