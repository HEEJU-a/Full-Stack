package sec06.ch06;

public class StaticExam3 {

	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println("result : " + result);
		
		int result1 = Calcstatic.sum(10, 30);
		System.out.println("result1 : " + result1);

	}

}

class Calcstatic {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance{
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}
