package sec06.ch06;

public class StaticExam5 {

	public static void main(String[] args) {
		
		//n1에 10
		//n2에 20
		//sum() 메소드 호출하여 결과값 찍어라
		
		StaticExam5 se = new StaticExam5();
		se.n1 = 10;
		se.n2 = 20;
		int result = se.sum();
		System.out.println("result : " + result);

	}
	
	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	} 

}
