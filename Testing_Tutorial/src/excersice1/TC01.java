package excersice1;

import org.testng.annotations.Test;

public class TC01 {
	@Test(groups=("Smoke"))
	public void apple()
	{
		System.out.println("apple 13");
	}	

	@Test
	public void samsung()
	{
		System.out.println("samaung galaxy");
	}
	
	@Test
	public void mi()
	{
		System.out.println("mi note");
	}

}

	



