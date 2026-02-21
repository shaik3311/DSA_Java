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
        //         if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        //             count++;
        //         }
        //     }
        //     max_count = Math.max(max_count,count);
        //     left++;
        //     right++;
        // }

        System.out.println(max_count);
    }
}