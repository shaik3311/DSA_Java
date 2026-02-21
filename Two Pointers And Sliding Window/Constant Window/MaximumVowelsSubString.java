// 1456. Maximum Number of Vowels in a Substring of Given Length


import java.util.*;

public class MaximumVowelsSubString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();


        int left = 0;
        int right = k-1;
        int max_count = 0;

        // Brute force approach with TC->O(n*k) SC->O(1) 
        // while(right<str.length()){
        //     int count = 0;
        //     for(int i=left;i<=right;i++){
        //         if(isVowel(str.charAt(i))){
        //             count++;
        //         }
        //     }
        //     max_count = Math.max(max_count,count);
        //     left++;
        //     right++;
        // }


        // Optimal approach with TC->O(n) SC->O(1) 
        int count = 0;
        for(int i=left;i<=right;i++){
            if(isVowel(str.charAt(i))){
                count++;
            }
        }
        max_count = Math.max(max_count,count);
        while(right<str.length()-1){
            if(isVowel(str.charAt(left))){
                count--;
            }
            left++;
            right++;
            if(isVowel(str.charAt(right))){
                count++;
            }
            max_count = Math.max(max_count,count);
        }

        System.out.println(max_count);
    }
    
    // helper function for finding a char is vowel ?? 
    public static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}