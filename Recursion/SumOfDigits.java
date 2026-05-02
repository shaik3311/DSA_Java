public class SumOfDigits{
    public static void main(String args[]){
        System.out.println(sum(123));
    }
    public static int sum(int n){
        return helper(n,0);
    }
    public static int helper(int n,int sum){
        if(n<=0) return sum;
        sum += n%10;
        return helper(n/10,sum);
    }
}