package polymorphism;
class Parents{
	public void property(){
		System.out.println("10000 crore property");
	}
	public void marriage() {
		System.out.println("we are trying to do arrange marriage");
	}
}

public class Vinay {
	public void marriage() {
		System.out.println("am alreay in love");
	}
public static void main(String[] args) {
	Vinay v=new Vinay();
	v.marriage();
}
}
