package sec06.ch04;

public class IfExam4 {

	public static void main(String[] args) {
		
		//삼항식
		
		System.out.println(abs(-10));
		System.out.println(abs(7));
	}
	/*
	public static int abs(int val) {
		if(val < 0) {
			return -val;
		}
		return val;
		
	}
	*/
	

 	public static int abs(int a) {
 		return a < 0 ? -a : a;
 	}
}
