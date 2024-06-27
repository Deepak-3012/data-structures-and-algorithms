package recursion;
import java.util.Scanner;
public class PrintDecreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
    private static void printDecreasing(int n){
        if(n==0) return; //base case
        System.out.println(n); // reaching expection from faith
        printDecreasing(n-1); // faith
    }
}
