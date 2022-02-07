package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException
	{
		File f1=new File("F:\\play.txt");
		if (f1.createNewFile())
		{
			System.out.println("File created");
		} else {
			System.out.println("file not created");

		}

	}

}
