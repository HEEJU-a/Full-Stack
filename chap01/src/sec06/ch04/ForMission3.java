package sec06.ch04;

public class ForMission3 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 6) + 5;
		
		System.out.println("star : " + star);
		// star는 5~10사이 랜덤값 나올수 있게!
		// 만약 star값이 5였다면 콘솔에 "*****"
		// 만약 star값이 8이였다면 콘솔에 "********"
		
		for(int i =0; i < star; i++) {
			System.out.print("*");
		}
	}
}
