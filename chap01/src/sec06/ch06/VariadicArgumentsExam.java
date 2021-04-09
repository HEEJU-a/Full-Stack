package sec06.ch06;

public class VariadicArgumentsExam {

	public static void main(String[] args) {
		Calc2 calc2 = new Calc2();
		int result = calc2.sum(10, 20);
		System.out.println("result : " + result);
		result = calc2.sum(10, 20, 30);
		System.out.println("result : " + result);
		result = calc2.sum(10, 20, 30, 40);
		System.out.println("result : " + result);
		result = calc2.sum(10, 20, 30, 40, 40, 40, 40, 40);
		System.out.println("result : " + result);

		

	}

}

class Calc2{
	int sum(int... vals) {
		int sum = 0;
		for(int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}


