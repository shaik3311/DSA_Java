import java.util.*;

public class ReverseBits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = String.format("%32s",Integer.toBinaryString(n)).replace(' ', '0');
        System.out.println(binary);
        StringBuilder sb = new StringBuilder();
        for(int i=binary.length()-1;i>=0;i--){
            sb.append(binary.charAt(i));
        }
        int reversedN = Integer.parseInt(sb.toString(),2);
        System.out.println(reversedN);
    }
}