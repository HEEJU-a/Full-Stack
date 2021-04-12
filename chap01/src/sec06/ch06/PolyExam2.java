package sec06.ch06;

public class PolyExam2 {
/*
  1. 부모타입은 자식객체 주소값을 참조할 수 있다 ( 가리킬 수 있다. )
  2. 자식타입은 부모객체 주소값을 참조할 수 없다.
  
 */
	public static void main(String[] args) {
		Animal ani1 = new Hamster(); 
		Animal ani2 = new Animal(); 
//		Animal ani3 = new String(); -> 안됨!
		//Hamster ham = (Hamster)ani2; //-> 컴파일에러는 안나지만 런타임에러남!
		Hamster ham1 = (Hamster)ani1; 
		System.out.println("끝");
	}
	
}
