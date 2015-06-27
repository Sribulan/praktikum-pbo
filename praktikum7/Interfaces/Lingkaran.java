/**
 * 
 */
package praktikum7.Interfaces;

public class Lingkaran implements Bentukluas, BentukKelililng{
	private double jarijari;

	public Lingkaran(double jarijari) {
		this.jarijari = jarijari;
	}

	public double hitungKeliling() {
		return 2 * BentukKelililng.PHI * jarijari;

	}

		public double hitungLuas() {
		return Bentukluas.PHI * Math.pow(jarijari, 2);
	}

}