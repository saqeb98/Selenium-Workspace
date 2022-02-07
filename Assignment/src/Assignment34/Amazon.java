package Assignment34;

public class Amazon 
	{
		static void login() throws AmazonLoginException
		{
			int size =11;
			if (size<=10) {
				System.out.println("Accept");
			} else {
				throw new AmazonLoginException("Error");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			login();
		}
		catch(AmazonLoginException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
@SuppressWarnings("serial")
class AmazonLoginException extends Exception
{
	String msg;
	AmazonLoginException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}