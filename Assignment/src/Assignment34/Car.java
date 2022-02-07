package Assignment34;

public class Car 
{
	static void miliage() throws CarMiliageException
	{
		int fuel=0;
		if (fuel>10) 
		{
			System.out.println("Drive");
		} else 
		{
			throw new CarMiliageException("Empty");
		}
	}
	public static void main(String[] args)
	{
		try {
			miliage();
		} catch (CarMiliageException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
@SuppressWarnings("serial")
class CarMiliageException extends Exception
{
	String msg;
	CarMiliageException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}