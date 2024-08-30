package com.assigment;

public class Avaeage {
	 public static void main(String[] args)
	 {	       
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int sum = 0;
	        for (int element : array) {
	            sum += element;
	        }
	        double average = (double) sum / array.length;
	        System.out.println("Average value of the array elements: " + average);
	    }
}
