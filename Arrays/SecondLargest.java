import java.util.*;

public class SecondLargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findSecondLargest(arr,n));
    }
    public static int findSecondLargest(int[] arr,int n){
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                sec_max = max;
                max = arr[i];
            }else if(arr[i]<max && arr[i]>sec_max){
                sec_max = arr[i];
            }
        }
        return sec_max;
    }
}