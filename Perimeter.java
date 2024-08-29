package methods;
import java.util.*;

public class Perimeter {

	public static void main(String[] args) {
		int l,b;
		try (Scanner qw = new Scanner(System.in)) {
			l=qw.nextInt();
			b=qw.nextInt();
		}
		System.out.println("perimeter of rectangle is "+(2*(l+b)));
		

	}

}
