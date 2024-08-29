package methods;
import java.util.*;

public class Simpleinterest {

	public static void main(String[] args) {
		int p,t,r;
		try (Scanner sc = new Scanner(System.in)) {
			p=sc.nextInt();
			t=sc.nextInt();
			r=sc.nextInt();
		}
		float total=(float)(p*t*r)/100;
		System.out.println("SI:"+(total+p));

	}

}
