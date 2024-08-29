package methods;
import java.util.*;

public class Exercise {

	public static void main(String[] args) {
		float tem;
		try (Scanner sc = new Scanner(System.in)) {
			tem=sc.nextInt();
		}
		float ft=(tem*9/5)+32;
		System.out.println(ft+"f");
		

	}

}
