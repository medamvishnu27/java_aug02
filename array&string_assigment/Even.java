package com.assigment;

public class Even {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5,6,7,8,9,10};
		
		
        System.out.println("Even numbers in the array:");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
	
	}
}
