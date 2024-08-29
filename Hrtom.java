package methods;

import java.util.Scanner;

public class Hrtom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		try (Scanner qw = new Scanner(System.in)) {
			min=qw.nextInt();
		}
		int h=min/60;
		int m=min%60;
		System.out.println(h+"Hr"+m+"min");
		

	}

}
