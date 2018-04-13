import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Puzzle {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String file =" ";
		Path path = null; 
		InputStream inputStream = null;
		FileWriter chars = null;
		int temp =0;
		int i=1;
		System.out.println("Hello i have 2 files i can add integers from ");
		System.out.println("puzzle, and puzzle2");
		System.out.println("Which would you like to open? ");
		
		file = sc.nextLine().toLowerCase();
		file = file+".txt";


		
		try {
			path = Paths.get(file);
			inputStream = Files.newInputStream(path);
			
			
								try {
										chars = new FileWriter ("sample.txt");
										while((temp = inputStream.read()) != -1) {
								
											if(i%3 == 0) {

												chars.write((char)temp);
									
											}
											i++;
										}
							chars.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			

			System.out.println("Output written to sample.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
