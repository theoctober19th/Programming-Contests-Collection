import java.util.Scanner;

public class Test{
	static Scanner scanner;

	public static int max(int[] arr){
		int m = arr[0];
		for(int i=0; i<arr.length; i++){
			if( m < arr[i] ){
				m = arr[i];
			}				
		}
		return m;	
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int t = scanner.nextInt();		

		for(int x=0; x<t; x++){
			int n = scanner.nextInt();
			int[][] nums = new int[n+1][n+1];

			for(int i=1; i<=n; i++){
				for(int j=1; j<=i; j++){
					int a = scanner.nextInt();
					int b = nums[i-1][j];
					int c = nums[i-1][j-1];
					if(a+b > a+c){
						nums[i][j] = a+b;
					}else{
						nums[i][j] = a+c;
					}
				}
			}

			System.out.println(max(nums[n]));

		}
	}

}