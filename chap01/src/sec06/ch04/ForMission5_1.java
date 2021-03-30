package sec06.ch04;

public class ForMission5_1 {
	public static void main(String[] args) {
		//\t
		//2*1=2 3*1=3 4*1=4 ....9*1=9 // -> 1은 늦게 돈다 그래서 바깥쪽 for문!
		//2*2=4 3*2=6 4*2=8.....9*2=18
		//2*3=6...
		//..
		//2*9=18 3*9=27 4*9=36... 9*9=81
		
		for(int i = 1; i <= 9; i++) {
			for(int n = 2; n <= 9; n++) {
				System.out.printf("%d * %d = %d\t", n, i, n*i);
			} System.out.println();
		}
	}
}
