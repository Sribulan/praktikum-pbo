
package Laporan8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CobaCheckedException {

	
	public static void main(String[] args) {
		try{
			FileInputStream file = new FileInputStream("D:/coba.txt");
			System.out.println("FileNotFoundException tidak terjadi");
		}
		catch (FileNotFoundException e){
			System.out.println("FileNotFoundException terjadi");
		}
		// TODO Auto-generated method stub

	}

}

