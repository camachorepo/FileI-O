import java.io.FileWriter;
import java.io.IOException;


public class Envelope {

	public static void main (String[] args) {
		
		String info = "+----------------------------------------------------------------+\r\n" + 
				"|                                                           #### |\r\n" + 
				"|                                                           #### |\r\n" + 
				"|                                                           #### |\r\n" + 
				"|                                                                |\r\n" + 
				"|                                                                |\r\n" + 
				"|                                      James Camacho             |\r\n" + 
				"|                                        470 Park Av             |\r\n" +
				"|                                             Apt#PH             |\r\n" +
				"|                                  New York, NY 10170            |\r\n" + 
				"|                                                                |\r\n" + 
				"+----------------------------------------------------------------+\r\n" + 
				""; 

		writeToConsole(info);

		writeToFile(info);
		

	}
	
	public static void writeToConsole(String info){
	
		System.out.println(info);
	}
	
	public static void writeToFile(String info) {
		
		try {
			FileWriter writeTo = new FileWriter("envelope.txt");
			writeTo.write(info);
			writeTo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
