import java.util.*;

public class MaximumAverageSubarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //size 
        int k = sc.nextInt();  //window size
        int[] arr = new int[n]; //array creation 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  //array input
        }

        int left = 0;
        int right = k-1;
        double max_avg = Double.NEGATIVE_INFINITY;

        // Brute Force method with TC->O(n*k), SC->O(1) 

        // while(right<n){
        //     double sum = 0;
        //     for(int i=left;i<=right;i++){
        //         sum += arr[i];
        //     }
        //     double avg = sum/(right-left+1);
        //     max_avg = Math.max(max_avg,avg);

        //     left++;
        //     right++;
        // }


        // Optimal approach with TC->O(n) SC->O(1)

        // double sum = 0;
        // for(int i=left;i<=right;i++){
        //     sum += arr[i];
        // }
        // max_avg =sum/k;
        // while(right<n-1){
        //     sum = sum - arr[left];
        //     left++;
        //     right++;
        //     sum = sum + arr[right];
        //     double avg = sum/k;
        //     max_avg = Math.max(max_avg,avg);
        // }


        System.out.println(max_avg);

    }
}