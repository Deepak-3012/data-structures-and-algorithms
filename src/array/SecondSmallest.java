        package array;
        import java.util.*;
        public class SecondSmallest {
            public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int size = sc.nextInt();
             int[] arr = new int[size];
             for(int i = 0; i<size; i++){
                 arr[i] = sc.nextInt();
             }
             int res = findSmallest(arr);
             if(res == Integer.MAX_VALUE)
                 System.out.println("NO second smallest elment found");
             else{
                 System.out.println(res);
             }
             sc.close();

            }
            private static int findSmallest(int[] arr){
                int smallest = Integer.MAX_VALUE;
                int second_smallest = Integer.MAX_VALUE;
                for(int i = 0; i < arr.length; i++){
                    if(arr[i] < smallest){
                        second_smallest = smallest;
                        smallest = arr[i];
                    }
                    else if(arr[i] < second_smallest && arr[i] != smallest){
                        second_smallest = arr[i];
                    }
                }
                return second_smallest;
            }
        }
