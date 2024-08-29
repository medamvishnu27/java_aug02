package methods;
import java.util.*;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b,k;
		try (Scanner qw = new Scanner(System.in)) {
			l=qw.nextInt();
			b=qw.nextInt();
			k=qw.nextInt();
		}
		System.out.println("Average is "+((l+b+k)/3));
		

	}

}
