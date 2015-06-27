package laporan5;

public class Lap5 {

	static String nama;  
    static String alamat;  
    static String hobi;  
    static String jeniskelamin;
	
	public static void main(String[] args) {
		Lap5 tampil = new Lap5();
		tampil.lihat();

	}
	
	
	public void set(String ika, String alauddin, String membaca, String perempuan) {  
        Lap5.nama = ika;  
        Lap5.alamat = alauddin;  
        Lap5.hobi = membaca;  
        Lap5.jeniskelamin = perempuan;  
    }
	
	public void lihat() {
		System.out.println("contoh pengimplementasian Class, Method, Atribut, Constructor");
		
        System.out.println("nama  : " + nama);  
        System.out.println("alamat  : " + alamat);  
        System.out.println("hobi:    "    + hobi);  
        System.out.println("jeniskelamin    : " + jeniskelamin);  
    }

}
