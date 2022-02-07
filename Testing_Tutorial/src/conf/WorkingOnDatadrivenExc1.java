package conf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingOnDatadrivenExc1 {


	@DataProvider(name="Data_Register")
	public  Object[][] test_Data()
	{
		Object[][] values=new Object[2][4];
		//First user
		values[0][0]="Rohan";
		values[0][1]="s";
		values[0][2]="rohans@gmail.com";
		values[0][3]="98566856";
		
		
		//Second user
		values[1][0]="S";
		values[1][1]="Rohan";
		values[1][2]="srohan@gmail.com";
		values[1][3]="6353663";
		return values;
	}
	@Test(dataProvider ="Data_Register")
	public void data_Driven(String FirstName,String LastName,String Email,String PhNo){
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(PhNo);
		System.out.println();
		
	}
	
}
