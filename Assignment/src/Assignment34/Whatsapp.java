package Assignment34;

public class Whatsapp 
{
	static void chat() throws WhatsappException
	{
		int limits=50;
		if (limits<=5) 
		{
			System.out.println("send message");
		} 
		else {
			throw new WhatsappException("Error");
		}
	}
	public static void main(String[] args) 
	{
		try{
		chat();
		}
		catch(WhatsappException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
@SuppressWarnings("serial")
class WhatsappException extends Exception
{
	String msg;
	WhatsappException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}