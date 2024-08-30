package com.assigment;

public class Sum {
	 public static void main(String[] args)
	 {
	        int[] array = {-1, 2, -3, 4, 5, 6, -7, 8, 9, -10};
	        int sum = 0;

	        System.out.println("Sum of negative numbers in the array:");

	        for (int element : array) {
	            if (element < 0) {
	                sum += element;
	                System.out.print(element + " ");
	            }
	        }

	        System.out.println("\nSum: " + sum);
	    }

}
