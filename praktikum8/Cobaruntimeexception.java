/**
 * 
 */
package praktikum8;

/**
 * @author Bulan
 *
 */
public class Cobaruntimeexception {
public static void main (String args[]){
	try{
		int a[]=new int[2];
		System.out.println("Akses elemen ke empat :"+ a [3]);
	}
	catch (ArrayIndexOutOfBoundsException e){
	System.out.println("indexoutofBoundsexception terjadi");
}
	System.out.println("Keluar blok eksepsi");
}
}


		
		
	