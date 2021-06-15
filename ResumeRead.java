package filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResumeRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f  = new FileInputStream("C:\\Users\\latha murugan\\Downloads\\Karpagam Murugan Resume.pdf");
	
		FileOutputStream w  = new FileOutputStream ("C:\\Users\\latha murugan\\Downloads\\NewWrite.pdf");
		int c = f.read();
		while(c!=-1)
		{			
		    w.write(c);
			c=f.read();
		} 
		w.flush();
		w.close();
		


	}

}
