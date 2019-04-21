/*this is valid solution using BigInteger*/

import java.math.BigInteger;
import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		BigInteger sum = new BigInteger("0");
		for(int i=0; i<n; i++){
			BigInteger temp = new BigInteger(in.next());
			sum = sum.add(temp);
		}

		System.out.println(sum.toString().substring(0,10));
	}
}