import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String input = in.next();

            int product;
			int maxProduct=0;

			for(int i=0; i<= n-k; i++){
				String number = input.substring(i, i+k);

				product = 1;

				for(char a: number.toCharArray()){
					product *= Character.getNumericValue(a);
				}

				maxProduct = Math.max(maxProduct, product);
			}

			System.out.println(maxProduct);
        }
	}
}