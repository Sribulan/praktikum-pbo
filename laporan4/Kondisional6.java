/**
 *
 */
package laporan4;

/**
 * @author Bulan
 *
 */
public class Kondisional6 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakDemo();
		BreakDemoDua();
		BreakLabel();
	}

	public static void BreakDemo() {
		int[] angka = { 32, 87, 3, 589, 12, 1076, 1000, 180, 622, 128 };
		int cari = 3;
		int i;
		boolean ketemu = false;
		for (i = 0; i < angka.length; i++) {
			if (angka[i] == cari) {
				ketemu = true;
				break;
			}
		}
		if (ketemu) {
			System.out.println("Ditemukan " + cari + "pada indeks " + i);
		} else {
			System.out.println(cari + "tidak terdapat dalam array");
		}
	}

	public static void BreakDemoDua() {
		for (int i = 0; i < 10; i++) {
			int k = 0;
			for (;;) {
				do {
					if (k == 5)
						break;
					k++;
				} while (k < 10);
				break;
			}
			System.out.println("k = " + k);
		}
	}

	public static void BreakLabel() {
		int[][] arrayAngka = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },
				{ 622, 127, 77, 955 } };
		int cari = 12;
		int i;
		int j = 0;
		boolean ketemu = false;
		for (i = 0; i < arrayAngka.length; i++) {
			for (j = 0; j < arrayAngka[i].length; j++) {
				if (arrayAngka[i][j] == cari) {
					break keluar;
				}
			}
		}
		if (ketemu) {
			System.out.println("Ketemu " + cari + "pada indeks" + i + "," + j);
		} else {
			System.out.println(cari + "tidak terdapat dalamArray");
		}
	}
}