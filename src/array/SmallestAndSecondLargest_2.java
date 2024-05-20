	package array;
	import java.util.*;
	public class SmallestAndSecondLargest_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i= 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		//edge case (n<2)
		if(n<2) {
			System.out.println("Enter more than one value to compare");
			sc.close();
			return;
		}
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > largest) {
				secondLarge = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLarge && arr[i] < largest) {
				secondLarge = arr[i];
			}
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
			
		}
		if(secondLarge == Integer.MIN_VALUE) {
			System.out.println("NO Second largest");
			System.out.println("Smallest: " + smallest);
			System.out.println("Largest: " + largest);
		}
		else {
			System.out.println("Smallest: " + smallest);
			System.out.println("Largest: " + largest);
			System.out.print("Second Largest: " + secondLarge);
		}
		sc.close();
	}
	}
