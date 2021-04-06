 package sec06.ch05;

public class MethodMission8 {

	public static void main(String[] args) {
		gugudan(8);
		//8*1 = 8
		//8*2 = 16
		// ...
		//8*9 = 72
		
		gugudan(4, 8); // 단 바뀔때 -------, 개행 구분자 사용

	}
	
	public static void gugudan(int n) {
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i );
		}
	}
	
	public static void gugudan(int n1, int n2) {
		for(int i = n1; i <= n2; i++) {
			gugudan(i);
			System.out.println("------------");
			
		}
	}
	
	/*
	 public static void gugudan(int n1, int n2) {
		for(int i = n1; i <= n2; i++) {
			for(int j = 1; j < 10; j++){
			system.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println("------------");
		}
	 */

}
