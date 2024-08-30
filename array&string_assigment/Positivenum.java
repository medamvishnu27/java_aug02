package com.assigment;

public class Positivenum {
	 public static void main(String[] args) {
	        int[] array = {-1, -2, 0, 1, 2, 3, -4, 5, 6, -7, 8, 9, 10};
	        System.out.println("Positive numbers in the array:");
	        for (int i : array) {
	            if (i > 0) {
	                System.out.print(i);
	            }
	        }
	    }

}
