package sec06.ch06;

public class InstanceExam3 {

	public static void main(String[] args) {
		int mainNum = 10; // mainNum 에는 리터럴값이 들어있고
		
		
		Box box1 = new Box(); // box1에는 Box()의 주소값 들어있음!!!! 
		box1.num = 10; //box1의 주소값을 알고있으면 언제든지 접근가능
		
		changeNum(mainNum);
		
		System.out.println("mainNum : " + mainNum);
		
		changeBoxNum(box1);
		System.out.println("box.num : " + box1.num);
	}
	
	public static void changeNum(int num) {
		num = 20;
	}
	
	public static void changeBoxNum(Box box2) {
		//box2 = new Box();
		box2.num = 20;
	}

}

class Box{
	int num;
}
