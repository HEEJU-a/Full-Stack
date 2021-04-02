package sec06.ch05;

public class MethodMission2 {

	public static void main(String[] args) {
		
		int n1 = 10, n2 =3; 
		double result = divide(10, 3); 
		System.out.println("result : " + result); // 3.3333333
		
		n2 = 5;
		result = divide(10, 5);
		System.out.println("result : " + result); //2.0
		
		
		System.out.println("절대값 : " + abs(10)); //10
		System.out.println("절대값 : " + abs(-10)); //10
		System.out.println("절대값 : " + abs(7)); //7
		System.out.println("절대값 : " + abs(-7)); //7
		
	}
	
	public static double divide(int n1, int n2){//n1이 위에 int이기 때문에 int로 받아야함 
			return (double) n1/n2;
	}
	
	public static int abs(int n){
		if(n < 0) {
			return -n;
		}
		return n;
	}
	
	
}
