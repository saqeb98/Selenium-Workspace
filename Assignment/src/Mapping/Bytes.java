package Mapping;

//import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.TreeMap;

public class Bytes {

	public static void main(String[] args)
	{
		Map<Byte, Integer> m1=new TreeMap<Byte, Integer>();
		byte[] arr={12,32,56,31,27,27};
		for (byte b : arr)
		{
			if (!m1.containsKey(b))
			{
				m1.put(b, 1);
			} else 
			{
				int count=m1.get(b);
				m1.put(b,count+1);
			}
		}
		for (java.util.Map.Entry<Byte, Integer> b1 : m1.entrySet()) 
		{
			System.out.println(b1.getValue()+" "+b1.getKey());
		}

	}

}
