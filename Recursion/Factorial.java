import java.util.*;

public class Factorial {
    public static void main(String args[]){
        System.out.println(findFact(5));
    }
    public static int findFact(int n){
        if(n==1) return 1;
        return n*findFact(n-1);
    }
}