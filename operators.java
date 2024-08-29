package assisnment.demo;
import java.util.*;

public class operators {
	public static void main(String[] args) {
		int a,b;
		try (Scanner sc = new Scanner(System.in)) {
			a=sc.nextInt();
			b=sc.nextInt();
		}
		//Arithmetic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		//Comparison operator
		if(a==b)System.out.println(a+" equal to "+b);
		if(a>=b)System.out.println(a+" greaterthan or equal to "+b);
	    if(a<=b)System.out.println(a+" smallerthan or equal to "+b);
	    if(a>b)System.out.println(a+" greater than "+b);
	    if(a<b)System.out.println(a+" smaller than "+b);
	    if(a!=b) System.out.println(a+" NOT equal to "+b);
	    //logical operator
	    if(a>=10 && a<=20)System.out.println(a+" is between 10 and 20");
	    else System.out.println(a+" is NOTbetween 10 and 20");
	    //Ternary operator
	    if(a%2==0)System.out.println(a+" EVEN");
	    else System.out.println(a+" ODD");	
	}

}
