package Object;

public class Equalss extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equalss e1=new Equalss();
		Equalss e2=new Equalss();
		System.out.println(e1.equals(e2));
		
		Equalss e3=new Equalss();
		Equalss e4=e3;
		System.out.println(e3.equals(e4));
	}

}
