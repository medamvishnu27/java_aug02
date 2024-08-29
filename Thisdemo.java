package com.inheritance;
class SuperDemo{
	int salary=50000;
	public void getSalary(int salary){
//		salary=700660;
		System.out.println("my parent salary is;"+salary);
		
	}
}

public class Thisdemo extends SuperDemo{
 int salary=40000;
 public void getSalary(int salary) {
	 salary=30000;
	 System.out.println("my salary is:"+salary);
	 System.out.println("my goba salary is:"+this.salary);
	 System.out.println("my onject is:"+this);
	 super.getSalary(700000);
	 System.out.println("my parent global salary is:"+super.salary);
 }
 public static void main(String[] args) {
	Thisdemo td=new Thisdemo();
	td.getSalary(20000000);
}
 }
