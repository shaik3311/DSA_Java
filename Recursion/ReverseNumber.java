public class ReverseNumber{
    public static void main(String args[]){
        System.out.println(reverse(123456789));
    }
    public static int reverse(int n){
       return helper(n,0);
    }
    public static int helper(int n, int rev){
        if(n<=0) return rev;
        rev = (rev*10)+n%10;
        return helper(n/10,rev);
    }
}