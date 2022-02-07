package Assessment1;
class Find
{
	static void count(String s1)
	{
		String[] arr=s1.split(" ");
	//	int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			
			char[] ch=(arr[i].toCharArray());
			for (int j = 0; j < ch.length; j++) 
			{
				for (int j2 = j+1; j2 < ch.length; j2++)
				{
				
					if (ch[j]==ch[j2])
					{
						//count++;
						System.out.print(arr[i]+"--> "+ch[j]+" ");
						
						break;
						
					}
				}
			}
		}
	//	System.out.println(ch[j2]++count+" ");

	}
}
public class Pg6 {

	public static void main(String[] args) {
		Find.count("my name is moohan anad i am from mangalore");

	}

}
