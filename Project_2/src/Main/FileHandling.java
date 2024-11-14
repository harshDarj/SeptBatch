package Main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public void readFile() throws IOException {
		File f = new File("/Users/harshaddarji/eclipse-workspace/Project_2/src/Main/Harshad.txt"); // Connection
		FileReader fr = new FileReader(f);  // fileReader object
		int a;     // taken Variable
		while((a = fr.read())!= -1)  //Loop
		{
			System.out.print((char)a); //
		}
	}
	public static void main(String[] args) throws IOException {
		FileHandling f = new FileHandling();
		f.readFile();
	}
}
