import java.util.*;

public class PrimeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkPrime(n)){
            System.out.println("Yes the number is prime");
        }else{
            System.out.println("No the number is not a prime number");
        }
    }
    public static boolean checkPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}