package sec06.ch04;

public class ForMission5 {
	public static void main(String[] args) {
		// 2~9단 구구단 출력!!
		// 2*1=2
		// 2*2=4...
		// 2*9=18
		// (빈칸)
		// 3*1=3
		// 3*2=6...
		// 3*9=27
		// ...
		// 9*9=81
		for(int i = 2; i <= 9; i++) {
			// System.out.println(); ->여기 줘도 됨!, 일단 위에 빈칸주고 시작한다
			for(int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d\n", i, n, i*n);
				//
			}
			  System.out.println();
		}
	}
}
