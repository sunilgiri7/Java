
class base{
	base(){
		System.out.println("This is constructor");
	}
	~base(){
		System.out.println("This is destructor");
	}
}

public class mainn(){
	public static void main(String args[]) {
		base b1 = new base();
	}
}