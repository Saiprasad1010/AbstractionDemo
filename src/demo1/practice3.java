package demo1;

public class practice3 extends practice1 {
static void vehical() {
	System.out.println("we create TWO WHELEER");
}
void run() {
	System.out.println("Speed Two wheeler is 60km/hr");
}
void wheel() {
	System.out.println("Two wheeler have 2 wheels");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice3  motorcycle=new practice3 ();
		vehical();
		motorcycle.run();
		motorcycle.wheel();
		
	}

}
