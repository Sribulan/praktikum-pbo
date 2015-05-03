/**
 * 
 */
package lap2;

/**
 * @author Bulan
 *
 */
public class Lap2{
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static float f;
	static int i;
	static long l;
	static short sh;
	static String str;

	static char c = 0xffff;
	static byte b = 0x7f;
	static short s = 0x7fff;
	static int il = 0x2f;
	static int i2 = 0x2F;
	static int i3 = 01777;
	static long n1 = 200L;
	static long n2 = 2001;
	static long n3 = 200;
	static float f1 = 1;
	static float f2 = 1F;
	static float f3 = 1f;
	static float f4 = 1e+9f;
	static double d1 = 1d;
	static double d2 = 1D;
	static double d3 = 47e47d;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

					System.out.println("bool = " + bool);
					b+=3;
					
					if(b==2)
						
						System.out.println("bool = " + f);
					else
						
						System.out.println("bool = " + d);
					

					System.out.println("by = " + by);
					System.out.println("ch = " + ch);
					System.out.println("d = " + d);
					System.out.println("f = " + f);
					System.out.println("i = " + i);
					System.out.println("l = " + l);
					System.out.println("sh = " + sh);
					System.out.println("str = " + str);
						
					
					
					System.out.println("char = " + c);
					System.out.println("byte = " + b);
					System.out.println("short = " + s);
					System.out.println("int = " + il);
					System.out.println("int = " + i2);
					System.out.println("int = " + i3);
					System.out.println("long  = " + n1);
					System.out.println("long = " + n2);
					System.out.println("long =" + n3);
					System.out.println("float =" + f1);
					System.out.println("float =" + f2);
					System.out.println("float =" + f3);
					System.out.println("float =" + f4);
					System.out.println("double =" + d1);
					System.out.println("double =" + d2);
					System.out.println("double =" + d3);
				}
			
		

	public static void objek() {
		// TODO Auto-generated method stub
		Boolean refBoolean = new Boolean(true);
		boolean bool = refBoolean.booleanValue();

		Byte refByte = new Byte((byte) 123);
		byte b = refByte.byteValue();

		Character refChara = new Character('X');
		char c = refChara.charValue();

		Short refShort = new Short((short) 123);
		short s = refShort.shortValue();

		Integer refInt = new Integer(123);
		int i = refInt.intValue();

		Long refLong = new Long(123L);
		long l = refLong.longValue();

		Float refFloat = new Float(12.3F);
		float f = refFloat.floatValue();

		Double refDouble = new Double(12.3D);
		double d = refDouble.doubleValue();

		System.out.println("bool =" + bool);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("s=" + s);
		System.out.println("i =" + i);
		System.out.println("l =" + l);
		System.out.println("f=" + f);
		System.out.println("d=" + d);
	}
}
