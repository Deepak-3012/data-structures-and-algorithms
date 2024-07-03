package recursion;
import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = findFactorial(n);
        System.out.println(res);
    }
    private static int findFactorial(int n){
        //expectation: f(5) -> 5 * 4 * 3 * 2 * 1
        // faith: f(4) -> 4 * 3 * 2 * 1
        if(n == 1) return n; // base case
        int fnm1 = findFactorial(n-1); // faith
        int fn = n * fnm1; // reaching expectaion from faith
        return fn;
    }
}