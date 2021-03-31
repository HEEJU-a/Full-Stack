package sec06.ch05;

public class ArrayExam {
	public static void main(String[] args) {
		// 배열(같은 타입의 변수를 여러개 사용하기 편하기 위해 사용하는것) -> 무조건 같은타입!!!!이어야함****중요!
		// 1, 100, 200, 34, 33, 
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		
		n2 = 10;
		n3 = n2 + 4;
		
		//원시형 : byte, short, int, long, boolean, char, float, double
		//변수 크게 분류(원시형, 참조형)
		/*
		int[] intArr = new int[10]; //default 값은 0!! 즉 각방에는 다 0이 들어가 있다
	
		intArr[0] = 11;
		intArr[1] = 12;
		intArr[19] = 13;
		intArr[3] = intArr[19] + 4;
		*/
		
		String[] strArr = new String[10];
		System.out.println("strArr[1] : " +strArr[1]);
		
		int len = 300;
		
		int[] intArr = new int[len];
		System.out.println("intArr[1] : " + intArr[1]);
		
		System.out.println("----------------------");
		int[] intArr2 = {10, 20, 30}; //-> 초기값 주고하는것
		
		intArr2[1] = 2000; // ->원래 1번방이 20인데 이렇게 주면 1번방이 2000으로 바뀜
		
		for(int i =0; i<3; i++) {
			System.out.printf("intArr2[%d] : %d\n", i, intArr2[i]);
			
		}
	}
}
