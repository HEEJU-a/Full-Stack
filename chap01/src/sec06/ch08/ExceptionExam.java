package sec06.ch08;


public class ExceptionExam {

	public static void main(String[] args) {
		
		try {
			//예외가 발생될 가능성이 높은 소스를 위치!!!
			System.out.println("크크크크크");
			int result = 10 / 2;
			System.out.println("result : " + result);
			System.out.println("하하하하하");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외 발생!!!!");
			System.out.println("예외 발생!!!!");
			System.out.println("예외 발생!!!!");
			
		}finally {
			System.out.println("무조건 실행!!!");
			
		}
		System.out.println("끝!!");
		

	}

}
