package com.evergent.CoreJAVA.Collection.arrays;
import java.util.Arrays;
public class ArraysFillExample2 {
		 public static void main(String[] args) {
		        int[] numbers = new int[5];
		        // Filling the array with a specific value
		        Arrays.fill(numbers, 7);
		        System.out.println("Filled array: " + Arrays.toString(numbers));
		 }
}