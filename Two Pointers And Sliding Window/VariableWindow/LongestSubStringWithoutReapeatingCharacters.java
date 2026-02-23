// 3. Longest Substring Without Repeating Characters 

import java.util.*;

public class LongestSubStringWithoutReapeatingCharacters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Brute Force With TC->O(n*n) SC->O(256);
        // int max = 0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> set = new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }else{
        //             set.add(s.charAt(j));
        //             max = Math.max(max,j-i+1);
        //         }
        //     }
        // }

        int max = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max,right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println(max);
    }
}