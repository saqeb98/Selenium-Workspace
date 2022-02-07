package Assignment34;

public class PhonePay 
{
	static void recharge() throws EnterValidAmtException
	{
		int amt=0;
		if(amt>10)
		{
			System.out.println("Recharged");
		}
		else{
			throw new EnterValidAmtException("Error");
		}
	}
	public static void main(String[] args) //throws EnterValidAmtException 
	{
		try {
			recharge();
		} catch (EnterValidAmtException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
@SuppressWarnings("serial")
class EnterValidAmtException extends Exception
{
	String msg;
	EnterValidAmtException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}