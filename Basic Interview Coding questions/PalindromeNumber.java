import java.util.*;

public class PalindromeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Yes it is a palindrome number");
        }else{
            System.out.println("No it is not a palindrome number");
        }

    }
    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int pop = temp%10;
            rev = (rev*10)+pop;
            temp = temp/10;
        }

        return rev==n;
    }
}