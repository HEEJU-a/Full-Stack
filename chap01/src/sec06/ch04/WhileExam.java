package sec06.ch04;

public class WhileExam {
	public static void main(String[] args) {
		//while문은 조건식이 true인 동안 반복
		/*
		while(true){
			System.out.println("안녕");  //-> 무한
		}
		*/
		
		for(int i =0; i<5; i++) {
			System.out.println("i: " + i);
		}
		System.out.println();
		
	// 위에 for문을 while문으로 바꾸기!	
		int i = 0;
		while(i<5) {
			System.out.println("i: " +i);
			i++;
		}
	}
}
