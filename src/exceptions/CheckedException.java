package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/TextFile");
		
		int k;
		
		while((k = fis.read()) != -1) {// read() method reads the characters one-by-one from the file 
										// read() method returns the ASCII value of the character.
										//if there is no character left, read() method returns -1.
			System.out.print((char)k);
		}
		
		fis.close();
	}

}

//Compile Time Exceptions: FileNotFoundException, IOException