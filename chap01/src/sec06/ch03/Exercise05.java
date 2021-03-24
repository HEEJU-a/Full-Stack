package sec06.ch03;

public class Exercise05 {
	public static void main(String[] args) {
		int value = 311;
		System.out.println(value / 100 * 100); 
		
		int result1 = value / 100;
		int result2 = result1 * 100;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		System.out.println(value - value % 100); // -> System.out.println(value / 100 * 100); 똑같은것!
		//												*보다 빼기가 더 속도가 빠르기 때문에 이게 퍼포먼스가 더 좋다 
	}
}
