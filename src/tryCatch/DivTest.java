package tryCatch;
/*
프로그램 실행시에 두개의 정수를 전달받아 나누기 결과를 출력하는 프로그램 작성
java DivTest 4 2

*/
public class DivTest {

	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println(r);
			System.out.println("작업종료");
		}		
		catch(ArithmeticException e){
			System.out.println("0으로 나누기 할 수는 없어요!");
		}catch(Exception e){
			System.out.println("나누기할 두 수를 전달해 주세요!");
		}

	}

}
