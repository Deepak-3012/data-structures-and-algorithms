package recursion;
import java.util.*;
public class Logarithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = logarithm(x,n);
        System.out.println(res);
        sc.close();
    }
    private static int logarithm(int x ,int n){
        if(n == 0 ) return 1;
        int xnBy2 = logarithm(x,n/2);
        int xn = xnBy2 * xnBy2;
        if(n%2 != 0){
            return xn * x;
        }
        return xn;

    }
}
