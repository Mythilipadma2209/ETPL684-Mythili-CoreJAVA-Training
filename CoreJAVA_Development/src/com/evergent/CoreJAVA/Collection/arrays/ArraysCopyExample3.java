package com.evergent.CoreJAVA.Collection.arrays;
import java.util.Arrays;
public class ArraysCopyExample3 {
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3, 4, 5};
        // Copying the array with a new length
        int[] copiedArray = Arrays.copyOf(originalArray, 7);
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
	}
}