package Assignment34;

public class Bus 
{
	static void book() throws FullBusException
	{
		int seat=52;
		if (seat>=53) 
		{
			System.out.println("Available");
		} else {
			throw new FullBusException("No seat");
		}
	}
	public static void main(String[] args) 
	{
		try{
		book();
		}
		catch(FullBusException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
@SuppressWarnings("serial")
class FullBusException extends Exception
{
	String msg;
	FullBusException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}