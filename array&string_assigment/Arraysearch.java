package com.assigment;

public class Arraysearch {
	public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        int targetElement = 7;

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                System.out.println("Element " + targetElement + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }

}
