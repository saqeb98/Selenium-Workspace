class Test
{
	private String name="hello";
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
public class Encap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		System.out.println(t1.getName());
		t1.setName("hi");
		System.out.println(t1.getName());
	}

}
