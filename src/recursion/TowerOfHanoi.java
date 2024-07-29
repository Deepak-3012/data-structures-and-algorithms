package recursion;
import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        toh(n,t1,t2,t3);
    }
    private static void toh(int n , int t1, int t2 ,int t3){
        //faith --> func know how to shift 2 blocks of total 3
        if(n == 0) return;
        toh(n-1, t1,t3,t2); //first 2 blocks to the third tower | left call
        System.out.println(n + " [" + t1 +" -> " + t2 + " ]"); //inline
        toh(n-1 , t3, t2, t1);// right call and moving 2 blocks to middle one
    }
}
