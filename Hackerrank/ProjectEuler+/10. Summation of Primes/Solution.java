import java.util.Scanner;

public class Solution{

    private static long sumOfPrimes(int n){
        long sum = 0;
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++){
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true){
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        for(int i = 2; i <= n; i++){
            if(prime[i] == true)
                sum += i;
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            System.out.println(sumOfPrimes(n));
        }
    }
}