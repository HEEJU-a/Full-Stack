package sec06.ch04;

public class ForMission8 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3; // 3~7 랜덤값
		// star = 4
		// **** 
		// ***  
		// **
		// *

		System.out.println("star : " + star);

		for (int i = star; i > 0; i--) {
			for (int n = 0; n < i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
