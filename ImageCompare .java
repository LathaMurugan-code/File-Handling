package filehandling;
import java.io.File;
import java.util.Date;
import java.util.TreeMap;
public class ImageCompare {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:\\Engagement pics");
		File[] files=f.listFiles();
		TreeMap <File,Date>t = new TreeMap<File,Date>();
	     for(File s:files)
		{
	    	 Date d = new Date(s.lastModified());
	    	 t.put(s, d);
			}
	     System.out.println(t);
	 	}

}

	

























