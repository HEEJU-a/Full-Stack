package sec06.ch07;


public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car(); //hoot
		Car car2 = new Bus(); //opendoor
		Car car3 = new LocalBus(); //opendoor
		Car car4 = new Truck(); //hoot
		
		blowKlaxon(car1); 
		blowKlaxon(car2); 
		blowKlaxon(car3); 
		blowKlaxon(car4); 
		

	}
	
	
	public static void blowKlaxon(Car a) {
		//어떤 객체를 생성하든 hoot메소드 실행
		//bus나 local버스라면 opendoor메소드 실행
		if(a instanceof Bus) {		
			Bus bus = (Bus)a;
			bus.openDoor();
		}else {
		a.hoot();
		}
	}
	

	

}
