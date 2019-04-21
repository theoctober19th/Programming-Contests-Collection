import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String input[] = new String[n];
		String number = "";
		for(int i=0; i<n; i++){
			input[i] = in.next();
		}

		long carry = 0;
		long sum=0;
		for(int j=4; j>=0; j--){
			sum = 0;
			for(int i=0; i<n; i++){
				number = input[i].substring(10*j, 10*(j+1));
				sum += Long.parseLong(number);
			}
			sum += carry;
			if(sum > 9999999999L) carry = sum/10000000000L;
			else carry = 0;
		}
		System.out.println(String.valueOf(sum).substring(0,10));
	}
}