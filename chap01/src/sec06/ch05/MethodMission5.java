package sec06.ch05;

public class MethodMission5 {
	
	// 메소드를 만드는 이유는 중복된 소스 최대한 제거하기위해!
	// 그리고 재활용 하기위해서!!
	public static void main(String[] args) {
		int star = 5;
		printStarTri(star);
		//*
		//**
		//***
		//****
		//*****
		System.out.println();
		
		star = 3;
		printStarTri(star);
		// *
		// **
		// ***
		
	}
	
	public static void printStarLine(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
	
	public static void printStarSqure(int z) {
		for(int i = 0; i < z; i++) {
			/*
			for(int j = 0; j < z ; j++) {
				System.out.print("*");
			}
			*/
			printStarLine(z); // 위에 주석for문대신에 이렇게 씀
			System.out.println();
		}
	}
	
	public static void printStarTri(int num) {
		for(int i = 1; i<=num; i++) {
			printStarLine(i); // 1, 2, 3, 4, 5
			System.out.println();
		}
	}
	
}
