package filehandling;
import java.io.File;
public class ImageCompare {
	static long mod_date =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:\\Engagement pics");
		File[] files=f.listFiles();
	
		for(int i=0;i<files.length;i++)
		{
			String s = g.getName();
			int dot = s.lastIndexOf(".");
			String exe=s.substring(dot+1);
			if(exe.equals("JPG"))
			{
			 ;
				}
			}
		
		

	}

}

	













