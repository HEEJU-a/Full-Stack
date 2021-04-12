package sec06.ch07;

public class PolyExam2 {

	public static void main(String[] args) {
		//instanceof는 상속관계일때 사용하는 기능
		
		Car car1 = new LocalBus();
		LocalBus lb1 = (LocalBus)car1;
		System.out.println(car1 instanceof LocalBus);
		
		Bus bus1 = (Bus)car1;
		System.out.println(car1 instanceof Bus);
		
		System.out.println(car1 instanceof Object);
		System.out.println("------------------");
		
		Car car2 = new Bus();
		System.out.println(car2 instanceof LocalBus);
		//-> 자식객체는 부모객체 주소값을 담을수 없다
		
		System.out.println("---------------");
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus);

	}

}
