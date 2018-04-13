import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInfo {

	
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		

		
		FileWriter scores;
		try {
			scores = new FileWriter("scores.txt");
			System.out.println("Please enter a name :");
			scores.write(sc.nextLine() + " ");
			
			System.out.println("Please enter a number : ");
			scores.write(sc.nextLine());
			
			scores.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
}
