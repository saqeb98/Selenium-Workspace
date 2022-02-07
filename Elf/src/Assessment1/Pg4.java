package Assessment1;
class Reverse
{
	static void rev(String s1)
	{
		String[] arr=s1.split(" ");
		for (int i = arr.length-1; i >=0; i--) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}
public class Pg4 {

	public static void main(String[] args) 
	{
		Reverse.rev("My name is YOURNAME");
	}

}
