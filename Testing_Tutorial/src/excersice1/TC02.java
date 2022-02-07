package excersice1;

import org.testng.annotations.Test;

public class TC02 {
	
	@Test(groups=("Smoke"))
	public void lap()
	{
		System.out.println("mac");
	}
	
	@Test
	public void desktop()
	{
		System.out.println("lenova");
	}
	
	@Test
	public void tab()
	{
		System.out.println("Samsung tab");
	}

}
