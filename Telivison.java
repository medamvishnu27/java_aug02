package polymorphism;
class OldTv{
	public void screen(){
		System.out.println("Screen of old tv is LCD");
	}
	public void sound() {
		System.out.println("sound of tv is 20hz");
	}
}

public class Telivison extends OldTv {
	public void screen(){
		System.out.println("Screen of new tv is LED");
	}
public static void main(String[] args) {
	Telivison tv=new Telivison();
	tv.screen();
}
	
}
