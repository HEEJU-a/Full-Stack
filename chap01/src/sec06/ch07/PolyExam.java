package sec06.ch07;

public class PolyExam {
/*
  1. 부모타입은 자식객체 주소값을 저장할수있다
  2. 자식타입은 부모객체 주소값을 저장할수없다.
  3. 변수타입은 메소드 호출여부만 결정!!!!!(자기가 아는것만 호출가능)
     호출이 되었다면 실행되는 것은 객체기준!!
 */
	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();
		
	// Bus bus1 = (Bus)new Car(); -> 실행안됨!
	//	Bus bus2 = (Bus)car2; -> 실행안됨!
		Bus bus1 = (Bus)car1; // -> 실행가능
		bus1.openDoor();
		bus1.hoot();
		
		System.out.println("------------------------(1)");
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3 = truck1;
		carP3.hoot();
	
		
		System.out.println("끝");
		
	}

}
