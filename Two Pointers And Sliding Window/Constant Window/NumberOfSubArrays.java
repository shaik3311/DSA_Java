// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold  

import java.util.*;

public class NumberOfSubArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int threshold = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = k-1;
        int count = 0;


        // Brute force approach with TC->O(n*k) SC->O(1) 
        // while(right<n){
        //     int sum = 0;
        //     for(int i=left;i<=right;i++){
        //         sum += arr[i];
        //     }
        //     if((sum/k)>=threshold){
        //         count++;
        //     }
        //     left++;
        //     right++;
        // }


        // Optimal Solution with TC->O(n) SC->O(1)  
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum += arr[i];
        }
        if((sum/k)>=threshold) count++;

        while(right<n-1){
            sum = sum - arr[left];
            left++;
            right++;

            sum = sum + arr[right];
            if((sum/k)>=threshold) count++;
        }

        System.out.println(count);
    }
}