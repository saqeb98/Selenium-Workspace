package Assignment33;

class Zomoto
{
	private String UN="Vikas";
	public String getUn(){
		return UN;
	}
	public void setUn(String UN){
		this.UN=UN;
	}
}


public class MainClass1 
{
	public static void main(String[] args) 
	{
		Zomoto g1=new Zomoto();
		System.out.println(g1.getUn());
		g1.setUn("Viki");
		System.out.println(g1.getUn());
		
	}

}
