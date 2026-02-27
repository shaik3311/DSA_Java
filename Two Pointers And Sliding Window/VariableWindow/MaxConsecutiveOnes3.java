// 1004. Max Consecutive Ones III 

import java.util.*;

public class MaxConsecutiveOnes3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // Brute Force With TC->O(n*n) SC->O(1) 
        int max = 0;
        // for(int i=0;i<n;i++){
        //     int zeros = 0;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]==0) zeros++;
        //         if(zeros<=k){
        //             max = Math.max(max,j-i+1);
        //         }else{
        //             break;
        //         }
        //     }
        // }

        // Better Approach With TC->O(2n) SC->O(1);
        // int zeros = 0;
        // int left = 0;
        // int right = 0;
        // while(right<n){
        //     if(arr[right]==0) zeros++;
        //     while(zeros>k){
        //         if(arr[left]==0) zeros--;
        //         left++;
        //     }
        //     max = Math.max(max,right-left+1);
        //     right++;
        // }


        // Optimal Approach With TC->O(n) SC->O(1) 
        int zeros = 0;
        int left = 0;
        int right = 0;
        while(right<n){
            if(arr[right]==0) zeros++;
            if(zeros>k){
                if(arr[left]==0){
                    zeros--;
                }
                left++;
            }
            if(zeros<=k){
                max = Math.max(max,right-left+1);
            }
            right++;
        }

        System.out.println(max);
    }
}