package com.abstraction;
abstract class TestAbstract{
	public static void m1() {
		System.out.println("i am m1 method");
	}
	protected abstract void sleep();
	public TestAbstract() {
		System.out.println("i am abstract class constructor");
	}
}


public class Demo extends TestAbstract{

	@Override
	public void sleep() {
		System.out.println("i am sleeping");//for abstract class we cant create objects
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.sleep();
	}
	
	
	

}
