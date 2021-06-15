package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f = new FileReader("E:\\File\\Methods\\Firstfile");
		int c = f.read();
		int count=1;
		while(c!=-1)
		{
			if((char)c==' ')
				count++;
			System.out.print((char)c);
			c=f.read();
		}
		System.out.println();
		System.out.println("count of words "+count);
				

	}

}
