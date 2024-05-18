package array;

public class Length {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9 };
		int count = 0, i = 0, n;
		// 1. Manual method
		try {
			while (arr[i] != 'd')// this will be never true
			{
				count++;
				i++;
			}
		} catch (Exception e) {
			System.out.println("length is : " + count);
		}
		// 2. Using Built-in Method

		n = arr.length;
		System.out.print("length using built-in method: " + n);

	}

}