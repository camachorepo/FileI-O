import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddingIntegers {
	
	
	public static void main (String [] args) {
		Path file = null;
		BufferedReader bufferedReader = null;
		int total=0;
		try {
			FileWriter integers = new FileWriter ("nums1.txt");
			String ints = "4 45 7324 ";
			integers.write(ints);
			integers.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		InputStream inputStream;
		try {
			file = Paths.get("nums1.txt");
			inputStream = Files.newInputStream(file);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String [] input = bufferedReader.readLine().split(" ");
			
			for(String s : input) {
				
			total += Integer.parseInt(s);
				
				
			}
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(total);
		
	}

}
