/**
 * 
 */
package Laporan8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaCheckedException2 {

	public static void main(String args[]) {
		try {
			FileInputStream file = new FileInputStream("e:/coba.txt");
			file.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		} catch (Exception e) {
		
			System.out.println("Exception");
			
			
		}
	}
}
