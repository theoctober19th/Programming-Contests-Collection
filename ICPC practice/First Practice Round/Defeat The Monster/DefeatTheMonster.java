import java.util.*;
  
public class DefeatMonsters { 
    static final int MAXN = 1000001; 

    static HashMap<Integer, Integer> primeCount  = new HashMap<Integer, Integer>();
       
    // stores smallest prime factor for every number 
    static int spf[] = new int[MAXN]; 
       
    // Calculating SPF (Smallest Prime Factor) for every 
    // number till MAXN. 
    // Time Complexity : O(nloglogn) 
    static void sieve() { 
        spf[1] = 1; 
        for (int i=2; i<MAXN; i++) 
       
            // marking smallest prime factor for every 
            // number to be itself. 
            spf[i] = i; 
       
        // separately marking spf for every even 
        // number as 2 
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
       
        for (int i=3; i*i<MAXN; i++) 
        { 
            // checking if i is prime 
            if (spf[i] == i) 
            { 
                // marking SPF for all numbers divisible by i 
                for (int j=i*i; j<MAXN; j+=i) 
       
                    // marking spf[j] if it is not  
                    // previously marked 
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 
       
    // A O(log n) function returning primefactorization 
    // by dividing by smallest prime factor at every step 
    static void factorize(int n) 
    { 
        int x = n, acc=1, prime;
        while (x != 1) 
        { 
            prime = spf[x];
            if(acc%prime != 0) {
//                System.out.print("Primes: " + prime);
                if(primeCount.get(prime) == null) primeCount.put(prime, 1);
                else primeCount.put(prime, primeCount.get(prime) + 1);
            }
            acc = acc*prime;
            x = x / spf[x]; 
        }
    } 
       
    // Driver method 
    public static void main(String args[]) 
    { 
        // precalculating Smallest Prime Factor 
        sieve();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++){
            int N = scanner.nextInt();
            int[] A = new int[N];
            primeCount.clear();
            for(int j=0; j<N; j++){
                A[j] = scanner.nextInt();
                factorize(A[j]);
            }
            int count = 0;
            for(Map.Entry<Integer, Integer> entry : primeCount.entrySet()){
                
//                System.out.println(entry.getKey() + " = " + entry.getValue());
                count += (int)Math.ceil(entry.getValue() / 3.0);
            }
            System.out.println(count);
        }
    } 
} 