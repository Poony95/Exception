package tryCatch;

public class DivTest3 {
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println(r);
		}		
		catch(ArithmeticException e){
			System.out.println("0으로 나누기 할 수는 없어요!");
		}catch(Exception e){
			System.out.println("나누기할 두 수를 전달해 주세요!");
		}finally{			// 오류가 발생하던 말던 항시 출력되는 문구지정 가능 finally
			System.out.println("작업종료");
		}
	}
}
