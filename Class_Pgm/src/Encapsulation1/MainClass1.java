package Encapsulation1;
class Email
{
	private String name,email;
	private int number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
public class MainClass1 {

	public static void main(String[] args) {
		Email e1=new Email();
		e1.setName("Vikas");
		e1.setEmail("vikas@gmail.com");
		e1.setNumber(867654);
		System.out.println(e1.getName()+" "+e1.getEmail()+" "+e1.getNumber());

	}

}
