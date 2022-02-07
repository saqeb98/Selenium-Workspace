package Assignment33;

class Account
{
	private String name,email;
	private long acc_no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	
}


public class MainClass5 
{
	public static void main(String[] args) 
	{
		Account a1=new Account();
		a1.setName("Vikas");
		a1.setEmail("vikas@gamil.com");
		a1.setAcc_no(754349812);
		
		System.out.println(a1.getName()+" "+a1.getEmail()+" "+a1.getAcc_no());
	}
}
