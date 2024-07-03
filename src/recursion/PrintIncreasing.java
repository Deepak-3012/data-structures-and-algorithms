package recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    private static void printDecreasing(int n) {
        if (n == 0) return; // base case
        printDecreasing(n - 1);//faith

        System.out.println(n);// meeting expectation with faith
    }
}
