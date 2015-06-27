package laporan3;

public class Lap3 {
	public static void main(String[] args) {
		byte angka = 15;
		byte angka2 = -10;
		int hasil = angka++ >> 4 + 15 * 4 | 15 << angka2;
		System.out.println(hasil);
		int hasil4 = 6 >> 4 + 15 * 4 | 15 << -10;
		System.out.println(hasil4);
		int hasil3 = 15 << -10;
		System.out.println(hasil3);
		int hasil5 = 15 << -10 | 6 >> 4;
		System.out.println(hasil5);
		int hasil2 = 10 * 4 | 110 << angka2;
		System.out.println(hasil2);
	}
}