/*needs optimization*/

import java.util.Scanner;
import java.util.*;

public class Solution{

	// private static int nthPrime(int n){

	// 	boolean prime[] = new boolean[104730];
	// 	int count = 1;
	// 	for(int i=0; i<104730; i++){
	// 		prime[i] = true;
	// 	}

	// 	int i = 2;

	// 	for(i=2; i*i <= 104729; i++ ){
	// 		if(prime[i]){
	// 			if(count == n) return i;

	// 			count++;
	// 			for(int j=i*2; j <=104729 ; j += i){
	// 				prime[j] = false;
	// 			}
	// 		}
	// 	}

	// 	while(count<=n){
	// 		while(!prime[i]){
	// 			i++;
	// 		}
	// 		if(count == n) return i;

	// 		count++;
	// 		i++;
	// 	}

	// 	return 0;

	// }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();

		// int n = 4;
        
       // int numColor = 0;
        char[] color = new char[n+2];

        for(int i=2; i<=n+1; i++){
        	color[i] = '1';
        }

        for(int i=2; i<=n+1; i++){
        	for(int j=2*i; j<=n+1; j = j+i){
        		color[j] = '2';
        	} 
        }

       if(n==1){
       	 System.out.println(1);
        System.out.println(1);
    }else if(n==2){
    	 System.out.println(1);
        System.out.println("1 1");
    }else{
    	 System.out.println(2);
        for(int i=2; i<=n+1; i++){
        	System.out.print(color[i] + " ");
        }
    }
	}
}