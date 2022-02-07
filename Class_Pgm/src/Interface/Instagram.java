package Interface;


interface Insta
{
	void signup();
	void login();
	void likeCommentShare();
}

class Features implements Insta
{
	public void signup()
	{
		System.out.println("Login page should be displayed");
	}
	
	public void login()
	{
		System.out.println("Home page should be displayed");
	}
	
	public void likeCommentShare()
	{
		System.out.println("Action should be performed");
	}
}
class Stimulator
{
	static void fea(Insta i1)
	{
		i1.signup();
		i1.login();
		i1.likeCommentShare();
	}
}
public class Instagram 
{
	public static void main(String[] args) 
	{
		Features f1=new Features();
		
		Stimulator.fea(f1);
	}
}
