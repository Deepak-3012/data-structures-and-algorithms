package recursion;
import java.util.Scanner;
public class DecreasingIncreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decreasingIncreasing(n);
    }
    private static void decreasingIncreasing(int n){
        if(n == 0) return;
        System.out.println(n);
        decreasingIncreasing(n-1);
        System.out.println(n);
    }

}
