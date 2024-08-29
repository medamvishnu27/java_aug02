package methods;
import java.util.*;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b;
		try (Scanner qw = new Scanner(System.in)) {
			l=qw.nextInt();
			b=qw.nextInt();
		}
		float q = (float)(3.14*b*(l*l));
		System.out.println("volume of cylinder in (cm3): "+q);
		

	}

}
