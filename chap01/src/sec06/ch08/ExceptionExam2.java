package sec06.ch08;

public class ExceptionExam2 {

	public static void main(String[] args) {
		//Calc 객체화 하고 div 메소드 호출 10과 2를 보내서 호출
		//리턴값 받고 콘솔에 출력
		
		Calc cal = new Calc();
		int result = cal.div(10, 0);
		System.out.println(result);
		
	}
	
	

}

class Calc{
	int div(int n1, int n2) {
		
		try {
			return n1 / n2;
		}catch(Exception e) {
			System.out.println("예외 발생");
		//	System.out.println(e);
		} finally {
			System.out.println("무조건 실행");
		}		
		System.out.println("try 밖 실행");
		return 0; 
	}
}
