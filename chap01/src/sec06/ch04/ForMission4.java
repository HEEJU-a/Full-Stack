package sec06.ch04;

public class ForMission4 {
	public static void main(String[] args) {
		int dan = (int)(Math.random() * 8) +2;
		// 2~9사이의 랜덤값 추출

		// 콘솔 (dan = 2)
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		// 콘솔 (dan = 4)
		// 4 * 1 = 4
		// 4 * 2 = 8
		// 4 * 3 = 12
		// ...
		// 4 * 9 = 36
		
		/*
		for(int i = 1; i<=9; i++) {
			//System.out.println(dan+ "*" + i +"=" + (dan*i));
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			
		}
		*/
		for(int i = 6; i <= 14; i++) {
			//System.out.println(i-5);
			int result = i-5;
			System.out.println(dan + "*" + result + "=" + dan*result);
			System.out.printf("%d * %d = %d\n", dan, result, (dan*result));
		}
		
	}
}
