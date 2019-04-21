import java.util.Scanner;

public class Solution{

	static int numberOfFactors(int n){
		int count = 0;
		for(int i=1; i*i<n; i++){
			if(n%i==0) count+=2;
		}
		if(Math.sqrt(n) == (int)Math.sqrt(n)) count++;
		return count;
	}

	static int firstTriangleNumber(int n){
		int tNumber;
		for(int i = 1; true; i++){
			tNumber = (i*(i+1))/2;
			if(numberOfFactors(tNumber) > n) return tNumber;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0; i< T; i++){
			int number = in.nextInt();
			System.out.println(firstTriangleNumber(number));
		}		
	}

}