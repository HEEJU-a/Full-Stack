package sec06.ch04;

public class WhileMission {
	public static void main(String[] args) {
		// 1~100 합계를 구하시오. (while문으로 해결)
		// 합계 : 5050
		// 62~78

		int i = 62;
		int sum = 0;

		while (i <= 78) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}
