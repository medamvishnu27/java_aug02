package variableanddatatype;
import java.util.*;
//import java.lang.*;
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,m,s,e;
		String st,g;
		try (Scanner qw = new Scanner(System.in)) {
			st=qw.next();
			age=qw.nextInt();
			m=qw.nextInt();
			s=qw.nextInt();
			e=qw.nextInt();
			
		}
		float t=(float)(m+s+e)/3;
		if(t>=7)g="First Class";
		else if(t>4)g="Second Class";
		else g="Fail";
		System.out.println("Name:"+st);
		System.out.println("Age:"+age);
		System.out.println("Grade in Maths:"+m);
		System.out.println("Grade in Science:"+s);
		System.out.println("Grade in English:"+e);
		System.out.println("Total Grade:"+g);

	}

}
