
public class Ctee 
{
	static void vote() throws VotersException
	{
		int age=17;
		if (age>=18) 
		{
			System.out.println("valid");
		} else 
		{
			throw new VotersException("error");
		}
	}
	public static void main(String[] args) {
		try{
			vote();
		}
		catch(VotersException e)
		{
			System.out.println(e.getMessage());
	
	}

	}

}
@SuppressWarnings("serial")
class VotersException extends Exception
{
	String msg;
	VotersException(String msg)
	{
		this.msg=msg;
	}
	public String getMsg()
	{
		return msg;
	}
}