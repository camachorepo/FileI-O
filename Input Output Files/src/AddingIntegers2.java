import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddingIntegers2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String file =" ";
		Path path = null; 
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		int total =0; 
		
		System.out.println("Hello i have 3 files i can add integers from ");
		System.out.println("nums1, nums2, nums3, nums4");
		System.out.println("Which would you like to open? ");
		
		file = sc.nextLine().toLowerCase();
		file = file+".txt";


		
		try {
			path = Paths.get(file);
			inputStream = Files.newInputStream(path);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			String [] ints = bufferedReader.readLine().split(" ");
			
			for(String s : ints) {
				
				total += Integer.parseInt(s);
			}
			
			System.out.println("The total for file:" + file + " is :" + total);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
