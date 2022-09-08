//Write a Java program to find the size of a specified file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class  FileSize{
	public static void main(String [] args){
		
		
		
		try{
			Path path = Paths.get("E:\\Uni java code\\Demo.txt");
			long bytes = Files.size(path);
			System.out.println(bytes+" bytes");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		

	}
}
