package excersice1;

import org.testng.annotations.Test;

public class TC03 {
	@Test
	public void amazon()
	{
		System.out.println("Ecommerce");
	}
	@Test
	public void uber()
	{
		System.out.println("Transport");
	}
	
	@Test(groups=("Smoke"))
	public void zomoto()
	{
		System.out.println("Foods");
	}
}
