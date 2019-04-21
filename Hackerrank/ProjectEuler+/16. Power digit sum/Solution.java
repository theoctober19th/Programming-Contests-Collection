import java.math.BigInteger;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String num;
		for(int a0 = 0; a0<t; a0++){
			int n = in.nextInt();
			num = "1";
			for(int i = 0;i<n; i++) num += "0";
			BigInteger number = new BigInteger(num, 2);
			num = number.toString();
			int sum = 0;
			for(int i=0; i<num.length(); i++){
				sum += num.charAt(i) - 48;
			}
			System.out.println(sum);
		}
	}
}