package CollectionTopic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) 
	{
			HashMap<String, Integer> h1=new HashMap<String,Integer>();
			h1.put("Ramesh", 5);
			h1.put("Suresh", 9);
			h1.put("Ramesh", 10);
			h1.put("Harish", 20);
			h1.put("Akahay", 20);
			System.out.println(h1);
			
			LinkedHashMap<String, Integer> l1=new LinkedHashMap<String,Integer>();
			
			l1.put("Ramesh", 5);
			l1.put("Suresh", 9);
			l1.put("Ramesh", 10);
			l1.put("Harish", 20);
			l1.put("Akahay", 20);
			
			System.out.println(l1);
			
			TreeMap<String, Integer> t1=new TreeMap<String,Integer>();
			t1.put("Ramesh", 5);
			t1.put("Suresh", 9);
			t1.put("Ramesh", 10);
			t1.put("Harish", 20);
			t1.put("Akahay", 20);
			
			System.out.println(t1);
			
	}

}
