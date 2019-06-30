
public class Review03_More_Variables {

	public static void main(String[] args) {
		// 3 types of integers
		long num1;
		int num2;		// use 4 bytes
		short num3;		// use 2 bytes
		byte num4, num5; // use 1 Byte = 8 bits
		
		num2 = 0XFF;
		
		num4 = 0X7F;
		num5= (byte)0xFF; // (byte) is a type casting
		
		
		System.out.println(num2);
		System.out.println(num4);
		System.out.println(num5);
	}

}
