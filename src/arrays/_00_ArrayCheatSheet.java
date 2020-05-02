package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruits = {"mango", "apple", "orange", "banana", "orange"};
		//2. print the third element in the array
		System.out.println(fruits[2]);
		//3. set the third element to a different value
		fruits[2] = "pear";
		//4. print the third element again
		System.out.println(fruits[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		//6. make an array of 50 integers
			int[] integers = new int[50];
			Random random = new Random();
		//7. use a for loop to make every value of the integer array a random number
			for (int j = 0; j < integers.length; j++) {
				integers[j] = random.nextInt(51);
			}
		//8. without printing the entire array, print only the smallest number in the array
		int min = 50;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] < min) {
				min = integers[i];
			}
		}
		System.out.println(min);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i]);
		}
		//10. print the largest number in the array.
		int max = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > max) {
				max = integers[i];
			}
		}
		System.out.println(max);
	}
}
