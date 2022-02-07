interface bank 
{
	void hdfc();
}
class Ceo implements bank
{
	public void hdfc()
	{
		System.out.println("Account");
	}
}
class manager implements bank
{
	public void hdfc()
	{
		System.out.println("loan");
	}
}
class employee implements bank
{
	public void hdfc()
	{
		System.out.println("account transfer");
	}
}

public class Sample {

	public static void main(String[] args) {
		bank b1=new Ceo();
		bank b2=new manager();
		bank b3=new employee();
		b1.hdfc();
		b2.hdfc();
		b3.hdfc();

	}

}
