package recursion;
import java.util.*;
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int times = sc.nextInt();
        System.out.println(power(num,times));

    }
    private static int power(int num, int times){
        if(times == 0)
            return 1; // base case
        int xminus1 = power(num , times-1); // faith
        int res= num * xminus1; // reaching expectation
        return res;


    }
}
