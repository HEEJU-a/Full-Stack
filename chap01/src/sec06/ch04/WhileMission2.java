package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		int val = (int)(Math.random() * 11); // 0~ 10사이 랜덤값이 나오도록
		
		//System.out.println("val1 : " + val);
		
		while(val != 0) {
			sum = sum + val;
			val = (int)(Math.random() * 11);
			System.out.println("val : " + val);
		}
		System.out.println("sum : " + sum);
		//int val 값이 0이 아니면 계속 sum에 더해라
		//sum = 지금까지 더한 값 출력
		
		
		
	}
}
