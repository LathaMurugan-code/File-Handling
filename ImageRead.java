package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImageRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("C:\\Users\\latha murugan\\Pictures\\lbdd.png");
		FileOutputStream w = new FileOutputStream("C:\\Users\\latha murugan\\Pictures\\written image.png");
		int c = f.read();
		while(c!=-1)
		{
			w.write(c);
			c=f.read();
		}
		
	}

}
