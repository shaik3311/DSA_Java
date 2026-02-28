import java.util.*;

public class LongestSubStringWithKUnique{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        // Brute Force With TC->O(n*n) SC->O(3)
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

        System.out.println(max);
    }
}