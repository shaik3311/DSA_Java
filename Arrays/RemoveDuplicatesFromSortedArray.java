import java.util.*;


public class RemoveDuplicatesFromSortedArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] arr = {1,2,2,3,3,4,5};
        int newLen = remove(arr,n);

        System.out.println("After removing duplicates");
        for(int i=0;i<newLen;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int remove(int[]arr,int n){
        if(n==0) return 0;
        int uniqueIdx = 0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[uniqueIdx]){
                uniqueIdx++;
                arr[uniqueIdx] = arr[i];
            }
        }

        return uniqueIdx+1;
    }
}