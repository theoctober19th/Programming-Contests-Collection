import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0; i<t; i++){
            
            int n = in.nextInt();
            BigInteger num = new BigInteger("1");
            for(int j=2; j<=n; j++){
                num = num.multiply(new BigInteger(String.valueOf(j)));
            }
            String fact = num.toString();
            int sum = 0;
            for(int k=0; k<fact.length(); k++){
                sum += fact.charAt(k) - 48; 
            }
            System.out.println(sum);
        }
    }
}