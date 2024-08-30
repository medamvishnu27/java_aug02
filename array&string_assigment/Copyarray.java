package com.assigment;

public class Copyarray {
	 public static void main(String[] args) {
	        int[] Array = {1, 2, 3, 4, 5};
	        int[] copyArray = new int[Array.length];

	        for (int i = 0; i < Array.length; i++) {
	            copyArray[i] = Array[i];
	        }

	        System.out.println("Copied Array:");
	        for (int element : copyArray) {
	            System.out.print(element + " ");
	        }
	    }

}
