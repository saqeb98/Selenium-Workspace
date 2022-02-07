package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		File f1=new File("F:\\play.txt");
		FileWriter fw=new FileWriter(f1,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi how are you");
		bw.newLine();
		bw.write("i'm fine");
		bw.flush();
		bw.close();
	
	}
	

}
