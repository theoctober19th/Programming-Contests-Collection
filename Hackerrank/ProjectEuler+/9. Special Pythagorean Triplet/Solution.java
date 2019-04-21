import java.util.Scanner;

public class Solution {
    public static int productOfTriplets(int n){
		if(n%2 != 0) return -1;  //N must be even for triplets to exist. (got from calculation)
		double B = 3;
		int b = 3;
		int c = 3;
		int maxProduct = -1;
		for(int a = 3; a < n/3; a++){      // since a< b< c, by calculation, it can be derived a<n/3
			B = (n*(n - 2*a))/(1.0*2*(n -a));    //this expression can be derived by solving two constraint equations
			if(B != (int)B) continue;    //if b happens not to be an integer, ignore this case
			b = (int)B;
			c = n - a - b;
			maxProduct = Math.max(maxProduct, a*b*c);
		}
		return maxProduct;
	}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(productOfTriplets(n));
        }
    }
}
