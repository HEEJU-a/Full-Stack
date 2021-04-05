package sec06.ch05;

public class MethodMission6 {

	public static void main(String[] args) {
		int score =  getRandomScore(50, 100);
		// 50~100 사이의 랜덤숫자가 나오도록 세팅!!!
		
		char grade = getGrade(score);
		//90점 이상 'A'
		//80점 이상 'B'
		//70점 이상 'C'
		//60점 이상 'D'
		//나머지 'E'
		char grade2 = getGrade2(score);
		//?8 두번째 자리가 8이상이거나 100점이면 '+'
		//?3 두번째 자리가 3이하면 '-'
		//나머지 ''빈칸이 리턴 되도록
		
		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}
	
		public static int getRandomScore(int n1, int n2) {
			return (int)(Math.random() * (n2-n1+1)) + n1;
		}
	
	
		public static char getGrade(int n) {
			if(n >= 90) {
				return 'A';
			}else if(n >= 80) {
				return 'B';
			}else if(n >= 70) {
				return 'C';
			}else if(n >=60) {
				return 'D';
			}
				return 'E';
			
		
		}
		
		public static char getGrade2(int n) {
			
			if(n == 100) {
				return '+';
			}
			
			int mod = n % 10;
			
			if(mod >= 8) {
				return '+';
			}else if(mod <= 3) {
				return '-';
			}
				return ' ';
				
		}
		
	/*
	 int mod = n % 10;
	 if(mod >= 8 || n ==100){
	 return '+';
	 }
	 
	 */

}
