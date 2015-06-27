/**
 * 
 */
package prak6.utama;

import prak6.Mobil;
import prak6.Mesin;
import prak6.Rangka;
import prak6.Mobil;

public class Truk extends Mobil{
		


	public void tongkang() {
		// TODO Auto-generated method stub

		mesin=new Mesin();
		stater();
		nama="Truk";
		System.out.println("Tongkang");
	}
	public static void main(String args[]){
		Truk truk=new Truk();
		truk.tongkang();
	}

}


