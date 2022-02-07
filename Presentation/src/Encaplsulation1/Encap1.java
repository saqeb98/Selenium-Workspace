package Encaplsulation1;

class Account
{
	private String name="Shilpa";
	private String email="shilpa@gmail.com";
	private int phno=54245;
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
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
}

public class Encap1 {
	public static void main(String[] args) {
		Account a1=new Account();
		System.out.println("old "+a1.getName());
		a1.setName("Vikas");
		System.out.println("New "+a1.getName());
		
		System.out.println("old "+a1.getEmail());
		a1.setEmail("vikas@gmail.com");
		System.out.println("New "+a1.getEmail());
		
		System.out.println("old "+a1.getPhno());
		a1.setPhno(54535);
		System.out.println("New "+a1.getPhno());
		
		a1.setEmail("vikas@gmail.com");
		a1.setPhno(75454);
		System.out.println(a1.getName()+" "+a1.getEmail()+" "+a1.getPhno());
		
	}
}
