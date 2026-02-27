import java.util.*;

public class MaxFruitsIntoBaskets{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // Brute Force With TC->O(n*n) SC->O(n)
        int max = 0;
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            int count = 0;
            for(int j=i;j<n;j++){
                set.add(arr[j]);
                if(set.size()<=2){
                    count++;
                    max = Math.max(max,count);
                }else{
                    break;
                }
            }
        }

        System.out.println(max);
    }
}