package com.codingdojo.project.testing;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		
//		Scanner se = new Scanner(System.in);
//		System.out.println("Enter number: ");
//		int num = se.nextInt();
//		System.out.println("Enter number: ");
//		int num2 = se.nextInt();
//		int sum = num + num2;
//		System.out.println("The number is " + sum);
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter your budget: ");
//		int budget = s.nextInt();
//		System.out.println("Enter the price of the item you're buying: ");
//		int price = s.nextInt();
//		int remaining = budget - price;
//		if(remaining <= 0) {
//			System.out.println("You cannot afford this");
//		}
//		else {
//			System.out.println("You have " + remaining + " balance remaining.");
//		}
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter your number: ");
//		int i = s.nextInt();
//		if(i % 2 == 0)
//			System.out.println("You number is even!");
//		else {
//			System.out.println("Your number is odd!");
//		}
//		
//	   int x = 100;
//	   int y = 53;
//	   int z = 54;
//	   if (x > y && x > z) {
//		   System.out.println(x + " Is the largest number");
//	   }
//	   else if(y > x && y > z) {
//		   System.out.println(y + " Is the largest number");
//	   }
//	   else {
//		   System.out.println(z + " Is the largest number");
//	   }
	   
	   int[] my_array = {
			   123,333,5345,352312,4356,22,1754
			   };
		String[] my_array2 = {
				"Java", "Word", "rust", "h1z1", "fortnite"
		};
		System.out.println("Original num " + Arrays.toString(my_array));
		Arrays.sort(my_array);
		System.out.println("New num " + Arrays.toString(my_array));
		System.out.println("Original Words " +Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("New Array " + Arrays.toString(my_array2));
	}

}
