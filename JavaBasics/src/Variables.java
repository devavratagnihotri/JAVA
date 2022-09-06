
public class Variables {

	public static void main(String[] args) {
		long l = 5000000000l; // 8 bytes
		int i = 50_00_000; // 4 bytes
		short s = 50; // 2 byte --> 16 bits
		byte b = 5; // 1 byte
		float f = 5.5f;
		double d = 5.5;
		
		char c = 'A'; 
		c = 66;// ASCII value will get printed
		System.out.println(c);
		double d1 = 5; // implicit conversion
		System.out.println(d1);
		int i1 = (int)5.5; // explicit type casting
		System.out.println(i1);
	}

}
