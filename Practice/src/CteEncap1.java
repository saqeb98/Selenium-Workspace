
public class CteEncap1 
{
	static void vote() throws VoterException
	{
		int age=17;
		if (age>=18) {
			System.out.println("valid");
		} else {
			throw new VoterException("printerror");

		}
	}

	public static void main(String[] args) {
		
		try {
			vote();
		} catch (VoterException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMsg());
		}
	}

}
@SuppressWarnings("serial")
class VoterException extends Exception
{
	String msg;
	VoterException(String msg)
	{
		this.msg=msg;
	}
	public String getMsg()
	{
		return msg;
	}
}