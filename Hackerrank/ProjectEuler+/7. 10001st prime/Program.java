/*needs optimization*/

import java.util.Scanner;
import java.util.*;

public class Program{

	private static int nthPrime(int n){

		boolean prime[] = new boolean[104730];
		int count = 1;
		for(int i=0; i<104730; i++){
			prime[i] = true;
		}

		int i = 2;

		for(i=2; i*i <= 104729; i++ ){
			if(prime[i]){
				if(count == n) return i;

				count++;
				for(int j=i*2; j <=104729 ; j += i){
					prime[j] = false;
				}
			}
		}

		while(count<=n){
			while(!prime[i]){
				i++;
			}
			if(count == n) return i;

			count++;
			i++;
		}

		return 0;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            System.out.println(nthPrime(n));
        }
	}
}