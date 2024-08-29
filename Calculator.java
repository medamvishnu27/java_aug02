package polymorphism;

public class Calculator {
	public void addtion(int a,int b,int c) {
		System.out.println("addition of three params are:"+(a+b+c));
	}
	public void addtion(int a,int b) {
		System.out.println("addition of two int values"+(a+b));
	}
	public void addition(double a,float b) {
		System.out.println("addition of int and float values:"+(a+b));
	}
	
	public static void main(String[] args) {
		Calculator ct=new Calculator();
		ct.addtion(32,23);
	}

}
