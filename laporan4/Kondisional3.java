/**
 *
 */
package laporan4;

import java.lang.invoke.SwitchPoint;

/**
 * @author Bulan
 *
 */
public class Kondisional3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchtest();
		switchtest2();
	}

	public static void switchtest() {
		int bulan = 7;
		switch (bulan) {
		case 1:
			System.out.println("januari");
			break;
		case 2:
			System.out.println("Februari");
			break;
		case 3:
			System.out.println("Maret");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Mei");
			break;
		case 6:
			System.out.println("juni");
			break;
		case 7:
			System.out.println("juli");
			break;
		case 8:
			System.out.println("agustus");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Oktober");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("Desember");
			break;
		default:
			System.out.println("Bulan Salah");
			break;
		}
	}

	public static void switchtest2() {
		int bulan = 2;
		int tahun = 2014;
		int jumlahhari = 0;
		switch (bulan) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			jumlahhari = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			jumlahhari = 30;
			break;
		case 2:
			if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0))
				jumlahhari = 29;
			else
				jumlahhari = 28;
			break;
		default:
			System.out.println("Bulan salah");
			break;
		}
		System.out.println("jumlah hari =" + jumlahhari);
	}
}