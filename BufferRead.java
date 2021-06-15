package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  FileReader fr = new FileReader("C:\\Users\\latha murugan\\Downloads\\Karpagam Murugan Resume.pdf");
	  //BufferedReader br = new BufferedReader(fr);
	  FileWriter fw = new FileWriter("C:\\Users\\latha murugan\\Downloads\\NewWrite");
	  /*BufferedWriter bw = new BufferedWriter(fw);
	   String word = br.readLine();
	   while(word!=null)
	   {
		   bw.write(word);
		   word=br.readLine();
	   }
	  bw.flush();
	  bw.close();*/
	  int c=fr.read();
	  while(c!=-1)
	  {
		  fw.write(c);
		  c=fr.read();
	  }
	  fw.flush();
	  fw.close();

	}

}
