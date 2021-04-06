package sec06.ch06;

public class InstanceExam {

	public static void main(String[] args) {
		Dog dog = new Dog(); 
		Dog dog2 = new Dog();
		
		dog.name = "뽀삐";
		dog2.name = "돌쇠";
		
		dog.bark();
		dog2.bark();
		
		/*
		String sss = new String("dddd");
		
		Dog dddd = sss; -> 이렇게는 안됨!!
		*/
	}

}
//멤버필드 : 값을 저장할 수 있는것 - 명사 담당, ex) 키, 몸무게, 등등..
//멤버메소드 : 값을 수정할 수 있는 것 - 동사 담당 ex) 커피마신다, 운동한다 등..
class Dog{
	String name;
	String jong;
	int age;
	
	void bark() {
		
		System.out.printf("%s가 멍멍\n", name);
	}
}

