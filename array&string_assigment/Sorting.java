package com.assigment;

public class Sorting {
	public static void main(String[] args) {
 
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Print the merged array
        System.out.println("Merged array: ");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }

}
