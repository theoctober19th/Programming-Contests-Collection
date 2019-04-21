import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long largestFactor = 2;
            
            while(n%2 == 0){
                n /= 2;
            }
            
            for(int i =3; i<= Math.sqrt(n); i += 2){
                
                while( n%i == 0){
                    largestFactor = i;
                    n /= i;
                }    
            }
            
            if(n>2){
                largestFactor = (int)n;
            }
            
            System.out.println(largestFactor);
        }
    }
}
