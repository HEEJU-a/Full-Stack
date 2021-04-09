package sec06.ch06;

public class PolymorExam {

	public static void main(String[] args) {
		Animal ani_1 = new Cat(); // -> 부모타입은 자식객체의 주소값을 담을수있다
	  //Cat cat1 = new Animal(); // -> 자식타입은 부모객체 가리킬수없음
		Cat cat = (Cat)ani_1;
		Animal ani_2 = cat;
		
		// Cat cat1 = (Cat)new Animal("", 0); // 부모타입객체는 자식타입객체에게 줄수없음
		
		ani_1.howling();
		cat.howling(); // -> 객체가 Cat이기 때문에 호출하면 야옹이나옴
	//	ani_1.lick(); //-> 이게 안되는 이유가 Animal에서는 lick의 
		              //      존재를 모른다
		cat.lick();
		
		System.out.println("끝!");

	}

}
