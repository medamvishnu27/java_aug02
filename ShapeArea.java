package polymorphism;

public class ShapeArea {
public double area(double side) {
	return side*side;
}
public double area(double length,double width) {
	return length*width;
}
public double area(double radius,boolean isCircle) {
	return Math.PI*radius*radius;
}
public static void main(String[] args) {
	ShapeArea sa=new ShapeArea();
	System.out.println("area of rectangle:"+sa.area(32,34));
	System.out.println("area of trainagle:"+sa.area(56));
	System.out.println("area of circle:"+sa.area(23,true));
}
}
