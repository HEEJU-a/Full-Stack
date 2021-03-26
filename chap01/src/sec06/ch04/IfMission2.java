package sec06.ch04;

public class IfMission2 {
	//여자 평균키 : 163
	//남자 평균키 : 175
	
	public static void main(String[] args) {
		String gender= "여"; //"여";
		int height= 177;
		
		if(gender.equals("남")) {
			if(height >= 176) {
				System.out.print(gender + ", " + height + " 평균초과"); 
			} else if(height == 175) {
				System.out.println(gender + ", " + height + " 평균");
			} else{
				System.out.println(gender + ", " + height + "평균미만");
			}
		}
		  else if(gender.equals("여")) {
			if(height >= 164) {
				System.out.println(gender + ", " + height + " 평균초과");
			}else if(height == 163) {
				System.out.println(gender + ", " + height + " 평균");
			} else {
				System.out.println(gender + ", " + height + "평균미만");
			}
		} else {
			System.out.println("측정할 수 없습니다.");
		}
		
	}
}

