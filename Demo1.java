package com.abstraction;
interface DemoInterf{
	final int age=30;
	public abstract void m1();
	       abstract void m2();
	                void m3();
	
}
public class Demo1 implements DemoInterf{

	@Override
	public void m1() {
	   System.out.println("am m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("am m2 method");// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		System.out.println("am m3 method");// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.m1();
		d.m2();
		d.m3();
	}

}
