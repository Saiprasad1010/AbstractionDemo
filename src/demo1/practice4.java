package demo1;

public class practice4 extends practice1{
	static void vehical() {
	System.out.println("We create bicycle");
	}
	void run() {
	System.out.println(" Max speed of bicycle is 30km/hr");
	
	}

	void wheel() {
	System.out.println(" Total wheels of bicycle are 2");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice4 bicycle=new practice4();
		vehical();
		bicycle.run();
		bicycle.wheel();
	}
}
