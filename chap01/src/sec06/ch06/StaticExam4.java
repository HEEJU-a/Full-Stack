package sec06.ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		//CalcInstance2 객체화
		//num1 = 10, num2 = 20;
		//더한값을 콘솔에 출력
		
		CalcInstance2 ci = new CalcInstance2();
		ci.num1 = 10;
		ci.num2 = 20;
		int result = ci.sum();
		System.out.println("result : " + result);
		
		String.format("%d", result); // -> static 메소드! 
		
	}

}
class Calcstatic2 {
	
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance2{
	int num1;
	int num2;
	int sum() {
		return num1 + num2;
	}
}
