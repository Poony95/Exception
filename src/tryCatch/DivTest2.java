package tryCatch;
/*
프로그램 실행시에 두개의 정수를 전달받아 나누기 결과를 출력하는 프로그램 작성
java DivTest 4 2

*/
public class DivTest2 {
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println(r);
		}		
		catch(Exception e){		//  <---- 이미 모든 예외 처리
			System.out.println("나누기할 두 수를 전달해 주세요!");
		}
		/*catch(ArithmeticException e){  // <-- 여기에 올 일이 없어요!
			System.out.println("0으로 나누기 할 수는 없어요!");
		}*/
	}
}
/*
C:\javaTest\day0329>javac DivTest03.java
DivTest03.java:17: error: exception ArithmeticException has already been caught
                catch(ArithmeticException e){
                ^
1 error

==> 하나의 try에 여러개의 catch를 쓸 때에는 
		범위가 작은 순서대로 와야 합니다.

*/
