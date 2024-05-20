package array;
import java.util.*;
public class LargestAndSecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int first_large = arr[0]; 
		int second_large = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i] > first_large) {
				second_large = first_large;
				first_large = arr[i];
			}
			if(arr[i] < first_large && arr[i] > second_large) {
				second_large = arr[i];
			}
			
		}
		System.out.println("First largest element is: " + first_large);
		System.out.print("Second largest element is :" + second_large);
		sc.close();
	}

}
