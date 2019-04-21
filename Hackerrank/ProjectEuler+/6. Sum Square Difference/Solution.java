import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            
            long sum = (n*(n+1))/2;
            long squareOfSum = sum*sum;
            long sumOfSquares = (n * (n+1) * (2*n+1) ) /6;
            System.out.println(squareOfSum);
            System.out.println(sumOfSquares);
            System.out.println((squareOfSum - sumOfSquares));
        }
    }
}
