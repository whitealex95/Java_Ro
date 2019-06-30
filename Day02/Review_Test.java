import java.util.Scanner;

public class Review_Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ans;
		System.out.print("1.사람이 작성한 프로그래밍 언어를 컴퓨터가 이해할 수 있는 컴퓨터 언어로 바꾸어주는 것을 무엇이라 하는가?\n 답: ");
		ans = scanner.nextLine();
		if(ans.equals("compile") ||  ans.equals("컴파일"))
			System.out.println("정답!");
		else {
			System.out.println("땡! 처음부터 다시하세요!");
			return;
		}
		
		System.out.print("2.우리가 사용하고 있는 IDE의 이름은?(영어로)\n 답: ");
		ans = scanner.nextLine();
		if(ans.equals("eclipse") ||  ans.equals("Eclipse"))
			System.out.println("정답!");
		else {
			System.out.println("땡! 처음부터 다시하세요!");
			return;
		}
		
		System.out.print("3.컴퓨터에서 int 변수는 몇개의 bit를 사용하는가?(숫자)\n 답: ");
		ans = scanner.nextLine();
		if(ans.equals("32") ||  ans.equals("32"))
			System.out.println("정답!");
		else {
			System.out.println("땡! 처음부터 다시하세요!");
			return;
		}
		
		System.out.print("3.컴퓨터에서 double 변수는 몇개의 byte를 사용하는가?(숫자)\n 답: ");
		ans = scanner.nextLine();
		if(ans.equals("8") ||  ans.equals("8"))
			System.out.println("정답!");
		else {
			System.out.println("땡! 처음부터 다시하세요!");
			return;
		}
		
		System.out.print("4. x라는 integer 변수를 0으로 선언과 초기화를 동시에 하시오.(세미콜론 주의)\n 답: ");
		ans = scanner.nextLine();
		if(ans.equals("int x = 0;") ||  ans.equals("0"))
			System.out.println("정답!");
		else {
			System.out.println("땡! 처음부터 다시하세요!");
			return;
		}
		
		System.out.print("5. 2's complement에 대해서 설명하시오");
		ans = scanner.nextLine();
		if(ans.equals("eclipse") ||  ans.equals("Eclipse")) {
			System.out.println("정답!");
			System.out.println("전부 맞추셨습니다! 완벽해요!");
		}
		else {
			System.out.println("땡! 처음부터 다시하세요!");
			return;
		}
		
		
		scanner.close();
		
	}
}
