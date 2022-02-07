package File_Handling;

import java.io.File;

public class createFolder {

	public static void main(String[] args) 
	{
		File f1=new File("F:\\HELLO");
		if(f1.mkdir())
		{
			System.out.println("Folder is created");
		}
		else{
			System.out.println("Folder not created");
		}
		
		//f1.delete();
		if(f1.exists())
			{
				System.out.println("Folder exist");
			}
		else
		{
			System.out.println("no folder");
		}
		
		

	}

}
