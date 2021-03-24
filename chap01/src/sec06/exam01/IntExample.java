package sec06.exam01;
/*
 * 정수 모두 정리(4가지)
 */
public class IntExample {
	public static void main(String[] args) {
		char c = 'a';
		
		
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		
		
		s = b;//자동형변환
		s = (short)i; //-> 강제형변환, 문제가 될경우에는 안쓰거나 강제형변환해줘야함
		
	}
}
