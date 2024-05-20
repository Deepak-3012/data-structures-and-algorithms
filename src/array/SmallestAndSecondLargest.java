package array;

import java.util.*;

public class SmallestAndSecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// approach-> manual sorting(TC - O(n*n))
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Smallest element is " + arr[0]);
		int j = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			if(i-1 >=0) {
				if (arr[i] == arr[i - 1]) {
					j--;
				} else if (arr[i - 1] < arr[i]) {
					j--;
					break;
				}
			}
		}
		System.out.println("Second largest is:" + arr[j]);
		sc.close();
	}

}
