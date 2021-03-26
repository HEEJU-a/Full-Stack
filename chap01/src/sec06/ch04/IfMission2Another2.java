package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
		String gender = "남";
		int height = 176;
		
		
		final int MANSTAND = 175;
		final int WOMANSTAND = 163;
		
		int stand = MANSTAND;
		
		
		if(gender.equals("여")) {
			stand = WOMANSTAND;
			System.out.print("여자 ");
			
		}else if(gender.equals("남")){
			System.out.print("남자 ");
		}
		
		
		
		if(height < stand) {
			System.out.println("평균 미만");
		}else if(height == stand) {
			System.out.println("평균");
		}else {
			System.out.println("평균 초과");
		}
	}
}


/*
 * package sec06.ch04;

public class Practice {
	public static void main(String[] args) {
		String gender = "남자";
		int height = 176;
		
		final int MANSTAND = 175;
		final int WOMANSTAND = 163;
		
		int stand = MANSTAND;
		
		
		if(gender.equals("여자")) {
			stand = WOMANSTAND;
			System.out.print("여자");
		}
			
		
		
		
		if(height < stand) {
			System.out.println(gender + " 평균 미만");
		}else if(height == stand) {
			System.out.println(gender + " 평균");
		}else {
			System.out.println(gender + " 평균 초과");
		}
	}
}

 */

/*
package sec06.ch04;

public class Practice {
	public static void main(String[] args) {
		String gender = "남";
		int height = 176;
		
		final int MANSTAND = 175;
		final int WOMANSTAND = 163;
		
		int stand = MANSTAND;
		
		
		if(gender.equals("여")) {
			stand = WOMANSTAND;
			
		}
		System.out.printf("%s자 ", gender);
		
		
		
		if(height < stand) {
			System.out.println(gender + " 평균 미만");
		}else if(height == stand) {
			System.out.println(gender + " 평균");
		}else {
			System.out.println(gender + " 평균 초과");
		}
	}
}
*/