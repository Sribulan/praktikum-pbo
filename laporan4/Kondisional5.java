package laporan4;

public class Kondisional5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForDemo();
		ArrayDemo();
	}

	public static void ForDemo() {
		for (int i = 1; i < 11; i++) {
			System.out.println("for 1 :" + i);
		}
		for (int i = 10; i >= -3; i--) {
			System.out.println("for 2 :" + i);
		}
		for (int i = 10, j = 2; i >= -3 & j < 10; i--, j++) {
			System.out.println("for 3 :" + i + "" + j);
		}
	}

	public static void ArrayDemo() {
		int[] angka = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int item : angka) {
			System.out.println("Angka :" + item);
		}
	}
}
