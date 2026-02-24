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
        for(int i=0;i<n;i++){
            int zeros = 0;
            for(int j=i;j<n;j++){
                if(arr[j]==0) zeros++;
                if(zeros<=k){
                    max = Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
        }

        System.out.println(max);
    }
}