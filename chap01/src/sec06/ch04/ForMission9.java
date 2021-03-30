package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
		int star = 5;

		// ____* 01234 0
		// ___** 56789 1
		// __***
		// _****
		// *****
   /*
		// for문 3개로 해결 가능
		for (int n = 0; n < star; n++) {
			for (int i = star-1; i > n; i--) {
				System.out.print("_");

			}
			for (int s = 0 ; s <= n; s++) {
				System.out.print("*");
			}
			System.out.println();

		}
		*/
		// for문 2개 + if로 해결가능
		for(int i = star; i>0; i--) {
			for(int k =1; k<=star; k++) {
				if(k < i) {
					System.out.print("_");
				}else {
					System.out.print("*");
				}
			}
		}System.out.println();
		
	}
}
