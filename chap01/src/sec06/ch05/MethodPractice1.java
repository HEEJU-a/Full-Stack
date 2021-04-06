package sec06.ch05;

public class MethodPractice1 {
	public static void main(String[] args) {
		Cloth cloth = new Cloth();
		cloth.name = "바지";
		cloth.price = 30000;
		cloth.gender = cloth.MAN;
		
		cloth.toPrint();
		
	}
	
	
}

class Cloth{
	final boolean MAN = true;
	final boolean WOMAN = false;
	String name;
	int price;
	boolean gender; // 남: true, 여: false 
	
	void toPrint() {
		String genderStr;
		if(gender) {
			genderStr="남";
		}
		else genderStr="여";
		
		System.out.printf("%s, %d, %s", name, price, genderStr);
	}
	
}
