
public class Review04_Twos_Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num1, num2, num3;
		num1 = 10;
		num2 = -10;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		// Something New!
		num1 = 0b0001_0101; // 0B or 0b means binary
		num2 = (byte)0B1110_1101;
		num3 = (byte)0xFA;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}

}
