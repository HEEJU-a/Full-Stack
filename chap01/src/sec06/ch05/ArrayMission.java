package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		//정수형 배열 생성(10칸짜리)
		//모든방에 정수값 20을 세팅해주세요
		
		int[] intArr = new int[10];
		
		
		for(int i =0; i<=9; i++) {
			intArr[i] = 20;
		}
		
		/*
		 위에 for문을 안쓸 경우는 이런식으로 다 지정해줘야함
		 intArr[0] = 20;
		 intArr[1] = 20;
		 intArr[2] = 20;
		 intArr[3] = 20;
		 intArr[8] = 20;
		 intArr[9] = 20;
		 */
		
		for(int i = 0; i <=9; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}
}
