package methods;
import java.util.*;

public class Maxtwonumbers {

	public static void main(String[] args) {
		int a,b;
		try (Scanner sc = new Scanner(System.in)) {
			a=sc.nextInt();
			b=sc.nextInt();
		}
		if(a>b)System.out.println(a+" is greater than "+b);
		else if(b>a)System.out.println(b+" is greater than "+a);
		else System.out.println(a+" is eual to "+b);

	}

}
