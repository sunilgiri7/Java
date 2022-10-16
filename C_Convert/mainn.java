public class mainn {
	mainn(){
		System.out.println("This is constructor");
	}
	// ~mainn(){
	// 	System.out.println("This is destructor");
	// }
}

class base{
	public static void main(String[] args) {
		mainn b1 = new mainn();
	}
}