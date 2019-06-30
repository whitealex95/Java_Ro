
public class Review05_Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dNum1;// use 8 bytes
		float dNum2;// use 4 bytes
		
		dNum1 = 0.1;
		dNum2 = (float)0.1;
		// need to do type casting if storing big value
		// to a little storage
		
		for(int i = 0; i < 10000;i++) {
			dNum1 = dNum1 + 0.01;
		}
		
		System.out.println(dNum1);
		System.out.println(dNum2);
		
		
	}	

}
