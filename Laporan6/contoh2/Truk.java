package Laporan6.contoh2;
import Laporan6.Mesin;
import Laporan6.contoh1.Becak;

public class Truk extends Becak{
	
	public Truk(){
	}

	public void angkut(){
//		mesin = new Mesin();
		stater();
		nama = "Truk";
		System.out.println("Becak dalam  Truk");
	}
	public void stater(){
		System.out.println("Stater Truk");
	}
	
	public static void main(String[] args) {
		Truk truk = new Truk();
		truk.angkut();
	}

}
