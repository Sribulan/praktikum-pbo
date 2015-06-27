/**
 * 
 */
package Laporan8;

import Laporan8.CobaCallStack;

public class  CobaCallStack{
	public  void metodeSatu() {
		int a[]=new int[2];
		System.out.println("Akses elemen ke tiga :" + a[3]);
		System.out.println("ini tidak tercetak");
	}
	
		
	public void methodDua(){
		try{
			metodeSatu();
			System.out.println("ini tida tercetak");
			
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("IndexoutOfBoundExepcetion terjadi");
		
		}
		System.out.println("setelah eksepsi");
	}
		public void main (String args[]){
			new CobaCallStack().methodDua();
		}
	}
	
