package tryCatch;

public class DivTest4 {
	
	public static void div(int a, int b) throws ArithmeticException{
		int r = a/b;	// 메소드안의 오류를 넣으면 뚱뚱하니까 해당오류를 메인으로 던짐
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try{
			div(a,b);
		}catch(ArithmeticException e){
			System.out.println("예외발생:"+e.getMessage());
		}		//.getMessage()는 자동으로 오류 발생 메세지 출력해줌.
	}
}
