package com.inheritance;
class Employee{
	String name;
	int age;
	String address;
	public Employee(String name,int age,String address) {
	    this.name=name;
		this.age=age;
		this.address=address;
		
	}
public void displayInfo() {
	System.out.println("Employee name:"+name);
	System.out.println("Employee age:"+age);
	System.out.println("Employee adress:"+address);
}

}
class PermanentEmployee extends Employee{
	double salary;
	public PermanentEmployee(String name,int age,String address,double salary) {
		super(name,age,address);
		this.salary=salary;
	}
public void displayInfo() {
	super.displayInfo();
	System.out.println("Salary is"+salary);
	
}}
class ContractEmployee extends Employee{
	int hourlybasis;

	public ContractEmployee(String name,int age,String address,int hourlybasis) 
	{
		super(name,age,address);
		this.hourlybasis = hourlybasis;
	}
	 public void displayInfo() {
		 super.displayInfo();
		 System.out.println("hourly salary:"+hourlybasis);
	 }
	}
	



public class TestEmploye {
	public static void main(String[] args) {
		PermanentEmployee pm=new PermanentEmployee("bhavitha",20,"hyd",8909.00);
		ContractEmployee ce=new ContractEmployee("bhavi",20,"nlg",900);
		pm.displayInfo();
		System.out.println();
		ce.displayInfo();
	}}


