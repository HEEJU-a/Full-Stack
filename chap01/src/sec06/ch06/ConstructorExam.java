package sec06.ch06;

public class ConstructorExam {
	//객체지향 언어는 모두 생성자를 사용함
	//생성자는 객체가 만들어질대 무조건 호출해야함
	/*
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Tv tv2 = new Tv();
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		
		tv.displayVolume(); // 콘솔에 현재 볼륨 : 3 찍히도록
		tv2.displayVolume();
		
	}
	*/
	
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		
		tv1.brand = "samsung";
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 100;
		tv1.displayState();
		//Samsung 100inch 100channel 100volume
		
		
		Tv tv2 = new Tv("Lg", 200, 150, 200);
		tv2.displayState();
		//Lg 200inch 150channel 200volume
	
	}
	
	
}

class Tv{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	

	Tv(){}
	
	Tv(String brand, int inch, int maxChannel, int maxVolume){
		this.brand =  brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	
	void displayState() {
		System.out.printf("%s, %dinch, %dchannel, %dvolume\n", brand, inch, maxChannel, maxVolume );
	}
	
	//기본생성자 ->
	//생성자 vs 메소드
	//이름은 클래스명이랑 같다
	//리턴타입이 없다
	//생성자는 객체 생성할때만 사용할수있음
	//기본생성자는 컴파일러가 생성자가 하나도 없을시 넣어준다
	
	void volumeUp() {
		
		currentVolume += 1; // currentVolume++, ++currentVolume -> 이것도 가능!
	}
	
	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
}
