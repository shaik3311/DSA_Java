import java.util.*;

public class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is : "+fact(n));
    }
    
    // Using loop 
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    // using recursion 
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}