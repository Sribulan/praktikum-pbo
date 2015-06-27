/**
 *
 */
package prak4;

/**
 * @author Bulan
 *
 */
public class Alurprogran {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int skor = 76;
		char grade;
		if (skor >= 90) {
			grade = 'A';
		} else if (skor >= 80) {
			grade = 'B';
		} else if (skor >= 70) {
			grade = 'C';
		} else if (skor >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade =" + grade);
	}
}