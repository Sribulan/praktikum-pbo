/**
 * 
 */
package praktikum8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
public class CobaThrows {

	
	public static void cobaMetode() throws FileNotFoundException,ParseException{
		FileInputStream file = new FileInputStream("e:/coba.txt");
		SimpleDateFormat.getInstance().parse("1234");
	
	public static void cobaMetodeDua(){
		try {
			cobaMetode();
		}
			
		
