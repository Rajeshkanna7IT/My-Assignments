package week3.day1;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
	
		int[] numbers= {1,23,45,12,13};
		
		//int data[]= {65,87,12,73,34};

		int totalsize=numbers.length;
		System.out.println("First number "+numbers[0]);
		
		System.out.println("last index value "+numbers[totalsize-1]);
		
		System.out.println("Total no of array values "+totalsize);
		
		System.out.println("Total size "+totalsize);
		
		Arrays.sort(numbers);
		
		System.out.println("Second smallest value "+numbers[1]);
		
				
				}

}
