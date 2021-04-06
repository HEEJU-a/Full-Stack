package sec06.ch06;

public class InstanceExam5 {

	public static void main(String[] args) {
		Car[] carArr = new Car[5]; 
		
		carArr[0] = new Car();// -> 이게 없으면 에러뜸 
		
		carArr[0].name = "그랜저";
	}
	

}
