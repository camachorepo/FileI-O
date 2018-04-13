import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Crazy {

	
	public static void main(String[] args) {
		
		String file =" ";
		Path path = null; 
		InputStream inputStream = null;
		FileWriter chars = null;
		int temp =0;
		
		file = "CrazyText.txt";
		
		try {
			path = Paths.get(file);
			inputStream = Files.newInputStream(path);
			
			
								try {
										chars = new FileWriter ("CrazyTextModified.txt ");
										while((temp = inputStream.read()) != -1) {
								
											char local = (char) temp;
										
											if(("aeiou".indexOf(local)) != -1) {
												chars.write(Character.toUpperCase(local));
									
											}
											else 
												chars.write(local);
												
										}
										
										
							chars.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			

			System.out.println("Output written to CrazyTextModified.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
