import java.util.*;

public class LongestSubArrayWithSumK {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    int start = 0;
    int end = 0;
    int max_size = 0;

    // Brute Force With TC->O(n*n) SC->O(1)
    // for(int i=0;i<n;i++){
    //   int sum = 0;
    //   for(int j=i;j<n;j++){
    //     sum += arr[j];
    //     if(sum<=k && (j-i+1)>max_size){
    //       max_size = j-i+1;
    //       start = i;
    //       end = j;
    //     }else if(sum > k){
    //       break;
    //     }
    //   }
    // }


    // Better Approach With TC->O(n+n) SC->O(1) better for is asked to print subarray
    // int left = 0;
    // int right = 0;
    // int sum = 0;
    // while(right<n){
    //   sum = sum + arr[right];
    //   while(sum > k){
    //     sum = sum - arr[left];
    //     left++;
    //   }
    //   if(sum <=k && (right-left+1)>max_size){
    //     max_size = right-left+1;
    //     start = left;
    //     end = right;
    //   }
    //   right++;
    // }

    int left = 0;
    int right = 0;
    int sum = 0;
    while(right<n){
      sum += arr[right];
      if(sum>k){
        sum -= arr[left];
        left++;
      }
      if(sum<=k){
        max_size = Math.max(max_size,right-left+1);
      }
      right++;
    }

    System.out.println(max_size);
    // for(int i=start;i<=end;i++){
    //   System.out.print(arr[i]);
    // }
  }
}
