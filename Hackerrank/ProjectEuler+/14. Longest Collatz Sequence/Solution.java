import java.util.Scanner;

public class Solution{
	/*static long count = 0;
	//static ArrayList checked = new ArrayList();
	static void collatz(long n){
		//if(checked.contains(n))
		System.out.prlong(n + " ");
		count++;
		if(n==1){
			return;
		} else if(n%2==0){
			collatz(n/2);
		} else{
			collatz(3*n+1);
		}
	}*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int count = 0;
		int maxCount = 0;
		int result = 1;
		for(int i = 0; i<t; i++){
			int n = in.nextInt();
			for(int j=n; j>0; j--){
				long k = (long)j;
				count = 0;
				while(k != 1){
					if(k%2==0) k/=2;
					else k = 3*k+1;
					count++;
				}
				if(count > maxCount){
					maxCount = count;
					result = j;
				}
			}
			System.out.println(result);
		}
	}
}