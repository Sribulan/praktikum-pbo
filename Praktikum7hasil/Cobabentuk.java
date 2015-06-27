/**
 * 
 */
package Praktikum7hasil;
import praktikum7.Bentuk;
import praktikum7.Bujursangkar;
import praktikum7.Segitigasamakaki;
import praktikum7.Segitigasamasisi;


public class Cobabentuk {

	
	public static void cetakBangun(Bentuk b) {
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(10, 10);
	}
	public static void main(String args[]){
		cetakBangun(new Bujursangkar());
		cetakBangun(new Segitigasamakaki());
		cetakBangun(new Segitigasamasisi());
	
		
	}

}
