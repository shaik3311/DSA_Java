import java.util.*;

public class LongestSubStringWithKUnique{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        // Brute Force With TC->O(n*n) SC->O(256)
        // int max = 0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> set = new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         set.add(s.charAt(j));
        //         if(set.size()<=k){
        //             max = Math.max(max,j-i+1);
        //         }else{
        //             break;
        //         }
        //     }
        // }


        // Better Approach With TC->O(n+n) SC->O(256) 
        // int max = 0;
        // int left = 0;
        // int right = 0;
        // HashMap<Character,Integer> map = new HashMap<>();
        // while(right<s.length()){
        //     map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
        //     if(map.size()>k){
        //         while(map.size()>k){
        //             map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
        //             if(map.get(s.charAt(left))<=0){
        //                 map.remove(s.charAt(left));
        //             }
        //             left++;
        //         }
        //     }else{
        //         max = Math.max(max,right-left+1);
        //     }
        //     right++;
        // }


        // Optimal Approach With TC->O(n) SC->O(256) 
        int max = 0;
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            if(map.size()>k){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                if(map.get(s.charAt(left))<=0) map.remove(s.charAt(left));
                left++;
            }else{
                max = Math.max(max,right-left+1);
            }

            right++;
        }


        System.out.println(max);
    }
}