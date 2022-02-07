package Thread_Topic;

class Demo implements Runnable
{
	public void run()
	{
		for (int i = 1; i <=10; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Sample extends Thread
{
	public void run()
	{
		for (int i = 1; i <=10; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multi_Thread
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		Thread th1=new Thread(d1);
		th1.start();
		Sample s1=new Sample();
		Thread th2=new Thread(s1);
		th2.start();

	}

}
