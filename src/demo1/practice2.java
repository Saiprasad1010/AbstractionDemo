package demo1;

public class practice2 extends practice1 {
	static void vehical() {
		System.out.println("We are making CAR");
	}
	void run() {
		System.out.println("Car Speed 90 km/hr");
	}
	void wheel() {
	System.out.println("Car wheels are 4");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice2 car=new practice2();
		vehical();
		car.run();
		car.wheel();
		
		
	}

}
