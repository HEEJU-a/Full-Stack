package sec06.ch04;

public class Practice {
	public static void main(String[] args) {
		String gender = "여";
		int height = 162;
		
		String displayGender = "남자", displayResult = "평균";
		
		final int MANSTAND = 175;
		final int WOMANSTAND = 163;
		int stand = MANSTAND;
		
		
		if(gender.equals("여")) {
			stand = WOMANSTAND;
			displayGender = "여자 ";
		}
		
		
		
		if(height < stand) {
			displayResult = "평균 미만";
		}
		else if(height > stand) {
			displayResult = "평균 초과";
		}
		System.out.printf("%s - %dcm : %s\n", displayGender, height, displayResult);
	}
  }
