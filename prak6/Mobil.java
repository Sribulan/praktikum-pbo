/**
 * 
 */
package prak6;

import prak6.Rangka;

public class Mobil {
	public Rangka rangka;
	public prak6.Mesin mesin;
	private int nomer;
	protected String nama;

	public Mobil(){
	rangka=new Rangka();
	
	mesin=new prak6.Mesin();
	System.out.println("konstruktor mobil");
	
	
}

	public void stater(){
		System.out.println("stater mobil");
	}

}
