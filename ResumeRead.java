package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/


public class ResumeRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f  = new FileInputStream("C:\\Users\\latha murugan\\Downloads\\latha edited resume (1).docx");
	
		FileOutputStream w  = new FileOutputStream("C:\\Users\\latha murugan\\Downloads\\cv write.docx");
		int c = f.read();
		while(c!=-1)
		{	
			/*if((char)c=='c')
			{
				for(int i=0;i<=10;i++)
				{
					c=f.read();
					w.write(c);
                    c=f.read();
				}
				char[] b = {'8','2','2','0','7','1','0','8','2','6'};
				for(int i=0;i<10;i++)
				{
					w.write(b[i]);
				}
			}*/
				
		    w.write(c);
			c=f.read();
		} 
		w.flush();
		w.close();
		
		    		


	}
	

}
