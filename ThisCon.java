package com.inheritance;
class SuperCon{
	int a=10;
	public SuperCon() {
		this(67);
		System.out.println("am default of parent constructor:"+a);
	}
	public SuperCon(int age) {
		System.out.println("am param of parent constructor:"+age);
	}
	
}
public class ThisCon extends SuperCon {
	int a=10;
	public ThisCon() {
		this(67);
		System.out.println("i am default constructor");
	}
	public ThisCon(int age) {
		this.m1();
		System.out.println("i am param constructor:"+age);
	}
	public void m1() {
		
		System.out.println("am m1 method");
	}
public static void main(String[] args) {
	ThisCon tc=new ThisCon();
	tc.m1();
	
}
}
