package Assignment33;

class Aadhar
{
	private long phNo=954555757;
	public long getPhNo()
	{
		return phNo;
	}
	public void setPhNo(long phNo)
	{
		this.phNo=phNo;
	}
}

public class MainClass2 
{
	public static void main(String[] args)
	{
		Aadhar a1=new Aadhar();
		System.out.println(a1.getPhNo());
		a1.setPhNo(787484654);
		System.out.println(a1.getPhNo());
	
	}
}
