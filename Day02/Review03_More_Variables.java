
public class Review03_More_Variables {

	public static void main(String[] args) {
		// 3 types of integers(정수)
		long num1; // use 8bytes
		int num2;  // use 4 bytes
		byte num4, num5; // use 1byte = 8bits
		var num6 = 255; //
		
		num2 = 0xFF;
		num4 = 0x7F;
		num5 = (byte)0xFF;
		
		int num = 65;
		char ch = (char)num; // char: 2byte.
		// num: int: 4byte
		
		System.out.println(num2);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(ch);
	}

}
