package array;
import java.util.Scanner;
public class ArraySortedOrNot {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    boolean isSorted = isArraySorted(arr);
    if(isSorted){
        System.out.println("The array is sorted");
    }
    else{
        System.out.println("The array is not sorted");
    }
    sc.close();
}
private static boolean isArraySorted(int[] array){
    for(int i = 1; i<array.length; i++){
        if(array[i] < array[i-1])
            return false;
    }
    return true;
}
}

