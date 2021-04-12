package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
		//새롭게 햄스터 객체 만들지 않고,
		//8번라인의 hamster변수에 저장된 주소값을 활용하여 
		//runRail 메소드 호출
		
		Hamster hhh = (Hamster)hamster;
		
		System.out.println(hamster instanceof Hamster);
		System.out.println(pig instanceof Hamster);
			
//		Hamster ham = (Hamster)hamster;
//		ham.runRail();
		
		cry(cat);
		cry(pig);
		cry(hamster); 
		
	}
	
	//ani로 Hamster 객체 주소값이 들어오면
	//howling 메소드 말고
	//runRail 메소드 호출해주세요
	//다른 객체들은 howling 메소드 호출
	
	public static void cry(Animal a) {
		a.howling();
		
		
	}
	
	
	
}
class Pig extends Animal{
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}
}

class Hamster extends Animal{
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
//	@Override
//	void howling() {
//		System.out.println("찍찍");
//	}
	
}
