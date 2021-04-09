package sec06.ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		// h1 나이는 12, 이름은 "홍길동"
	   // h2 나이는 20, 이름은 "신사임당"
		h1.setAge(12);
		h1.setName("홍길동");
		h2.setAge(20);
		h2.setName("신사임당");
		
		h1.whoAmI(); // 내 이름은 홍길동 나이는 12살입니다.
		h2.whoAmI(); // 내 이름은 신사임당 나이는 20살입니다.
		
		

	}
}
	
class Human{
	
	private final static int AGE = 10;
	private final static String NAME = "미상";
	
	private int age;
	private String name;
	//setter, getter
	
	Human(){
	//  age = 10;
	//	name = "미상";
		
		this(NAME, AGE);
		
	}
	
	Human(String name){
	// this.age = 10;
    // name = "평강공주";
		
		this(name, AGE);
	}
	
	Human(int age){
//		this.age = 30;
//		name = "미상";
		this(NAME, age);
	}
	
	Human(String name, int age){
		
// 		this.age = 20;
// 		this.name = "이순신";
	this.age = age;
	this.name = name;
	 // -> 지금 여기있는걸 위쪽으로 호출하려고 this()썼음
	}
	
	
	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살 입니다.\n",getName(), getAge() );
		//System.out.printf("name : %s, age : %d\n", getName(), getAge());
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

	
	
}




