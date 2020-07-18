package week.day;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] data = { 3, 7, 2, 8, 1 };
		Arrays.sort(data);
		System.out.println("ascending order is");
		for (int i = 0; i <= data.length - 1; i++) {
			System.out.println(data[i]);
		}
		System.out.println("second largest number is " + data[data.length - 1]);
	}

}
