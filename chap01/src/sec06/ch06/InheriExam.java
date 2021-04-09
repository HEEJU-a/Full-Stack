package sec06.ch06;

public class InheriExam extends Object{

	public static void main(String[] args) {
		Cat cat = new Cat();
//		cat.name = "고양이";
//		cat.age = 4;
		cat.howling();
//		cat.lick();
		

	}

}

class Animal extends Object{
	
	String name;
	int age;
	
//	Animal(){
//		super();
//		System.out.println("Animal 생성자");
//	}
//	
	
	
//	public Animal(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	
	void howling() {
		System.out.println("운다");
	}



}

class Cat extends Animal{

//	Cat(){
//		super("gg", 7);
//		
//	}
//	Cat(){
//		super();
//		System.out.println("Cat 생성자");
//	}
	
	void lick() {
		System.out.printf("%s가 핥다\n", name);
	}
	
	@Override
	void howling() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat{
	KoShort(){
		super();
	}
	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
}

