package polymorphism;
class Mother{
	public void eat() {
		System.out.println("dont eat icecream");
	}
}

public class Child {
	public void eat() {
		System.out.println("no no i want to eat icecream");
	}
public static void main(String[] args) {
	Child c=new Child();
	c.eat();
}
}
