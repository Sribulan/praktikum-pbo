package Laporan6.contoh1;
import Laporan6.contoh2.Bentor;
import Laporan6.contoh2.Truk;

public class Becaktest {
	
	public static void StaterBecak(Becak becak){
		becak.stater();
	}

	public static void main(String[] args) {
		Bentor bentor = new Bentor();
		Truk truk = new Truk();
		
		StaterBecak(new Becak());
		
		StaterBecak(bentor);
		
		StaterBecak(truk);

	}

}
