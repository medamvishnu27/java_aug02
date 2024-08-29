package methods;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		int rad;
		try (Scanner sc = new Scanner(System.in)) {
			rad=sc.nextInt();
		}
		float a=(float) (3.14*(rad*rad));
		System.out.println("area of circle in sqt:"+a);

}
}
