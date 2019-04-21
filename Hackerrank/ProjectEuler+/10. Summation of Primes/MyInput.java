import java.util.Scanner;

public class MyInput{


    public static void main(String[] args) {
        long Sum[] = new long[1000001];

        long sum = 0;
        boolean prime[] = new boolean[1000000+1];
        for(int i=0;i<=1000000;i++)
            prime[i] = true;
         int p;

        for( p = 2; p*p <=1000000; p++){
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true){
                // Update all multiples of p
                for(int i = p*2; i <= 1000000; i += p)
                    prime[i] = false;
            }
        }
         
        for(int i = 2; i <= 1000000; i++){
            if(prime[i] == true)
                sum += i;
                Sum[i] = sum;
        }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            System.out.println(Sum[n]);
        }
    }
}