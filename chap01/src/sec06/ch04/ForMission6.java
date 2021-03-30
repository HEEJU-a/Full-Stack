package sec06.ch04;

public class ForMission6 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3;
		// 3~7사이 랜덤값

		// star = 3; (3칸자리 별이 3줄)
		// ***
		// ***
		// ***

		// star = 5;( 5칸짜리 별이 5줄)
		// *****
		// *****
		// *****
		// *****
		// *****
		 System.out.println("star : " + star);
		 
		for(int i = 0; i < star; i++) {
			for(int n = 0; n < star; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
