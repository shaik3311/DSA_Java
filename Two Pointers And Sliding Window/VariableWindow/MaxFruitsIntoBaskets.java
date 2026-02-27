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
        // int max = 0;
        // for(int i=0;i<n;i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     int count = 0;
        //     for(int j=i;j<n;j++){
        //         set.add(arr[j]);
        //         if(set.size()<=2){
        //             count++;
        //             max = Math.max(max,count);
        //         }else{
        //             break;
        //         }
        //     }
        // }

        // Better Approach With TC->O(n+n) SC->O(3) 
        int max = 0;
        int left = 0;
        int right = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(right<n){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(arr[left],map.getOrDefault(arr[left],0)+1);
                    if(map.get(arr[left])<=0){
                        map.remove(arr[left]);
                    }
                    left++;
                }
            }else{
                max = Math.max(max,right-left+1);
            }
            right++;
        }

        System.out.println(max);
    }
}