package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File f = new File("E:\\File\\Methods\\subfolders");
		//if(f.exists())
	     // f.delete();
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		String[] s=f.list();
		for(String arr:s)
		{
			if(arr.charAt(0)=='k')
			System.out.println(arr);
		}
		File[] h=f.listFiles();
		for (File file:h)
		{
			if(f.isDirectory())
			{
			//System.out.println(file.getName());
			if(file.getName().charAt(0)=='L')
			{
				System.out.println("");
				System.out.println(file.getName());
			}
			}
	
		} 
		
		
	}
}
