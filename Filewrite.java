package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("E:\\File\\Methods\\Firstfile");
        String content = "Focus on goals you will suceeed one day!";
		f.write(content);
		f.flush();
		f.close();

	}

}
