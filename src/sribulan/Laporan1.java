/**
 * 
 */
package sribulan;

/**
 * @author Bulan
 *
 */
public class Laporan1 {

	/**
	 * @param args
	 */
	static String Laporan="Laporn praktikum PBO";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String laporan="laporan1";
		System .out.println("laporan 1");
		perkalian();
		pembagian();
		pengurangan();
		penjumlahan();
		Biodata();
	}
	//perkalian
			public static void perkalian()
			{
				int a=10;
				int b=20;
				System.out.println("perkalian "+ a * b );
			}
			
			
	//pembagian
				public static void pembagian()
				{
					int a=10/5;
					float b=10/3;
					System.out.println("pembagian " + a);
					System.out.println("pembagian " + b);
				}
	//pengurangan
				public static void pengurangan()
				{
					int a=350;
					float b=100;
					System.out.print("hasil pengurangan " +a+ "-" +b+ "=");
					System.out.println(a-b);
				}
		
	//penjumlahan
				public static void penjumlahan()	
				{
					int a=199;
					float b=222;
					System.out.print("hasil penjumlahan " +a+ "+" +b+ "=");
					System.out.println(a+b);
				}
	//Biodata
				public static void Biodata()
				{
					String nama="sri bulan";
					String alamat="Jl.Mamoa 5c";
					String matkul="PBO";
					System.out.println("nama " + nama + " alamat "+ alamat +" matkul "  + matkul); 
				}
	//test
			public static void test()
			{
				System.out.println(Laporan);
			
			}		
	
}

			
		
				
			
					
		
		
