// 1423. Maximum Points You Can Obtain from Cards

import java.util.*;

public class MaximumPointsFromCard {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<=k-1;i++){
            leftSum += arr[i];
        }
        max = leftSum;
        int rightIdx = n-1;
        for(int i=k-1;i>=0;i--){
            leftSum -= arr[i];
            rightSum += arr[rightIdx];
            rightIdx--;

            max = Math.max(max,(leftSum+rightSum));
        }

        System.out.println(max);
    }
}