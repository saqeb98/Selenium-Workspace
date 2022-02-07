package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AllInOne {

	public static void main(String[] args) throws IOException 
	{
		File f1=new File("F:\\hello.txt");
		f1.createNewFile();
		FileWriter fw=new FileWriter(f1,true);
		@SuppressWarnings("resource")
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("Hi");
		bw.newLine();
		bw.write("java");
		bw.flush();
		
		FileReader fr=new FileReader(f1);
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		String s1=br.readLine();
		while (s1!=null) 
		{
			System.out.println(s1);
			s1=br.readLine();
		}
		
	}

}
