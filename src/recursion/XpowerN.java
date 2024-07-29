package recursion;
import java.util.*;
public class XpowerN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));

    }
    private static int power(int x, int n){
        if(n == 0)
            return 1; // base case
        int xminus1 = power(x , n-1); // faith
        int res= x * xminus1; // reaching expectation
        return res;


    }
}
