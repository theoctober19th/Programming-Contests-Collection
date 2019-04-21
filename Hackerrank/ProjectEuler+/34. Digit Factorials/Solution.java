import java.util.Scanner;

public class Solution {

    static int factorial(int n){
        if(n==1 || n==0) return 1;
        else return n*factorial(n-1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int result = 0;
        for(int i=n-1; i>=19; i--){
            int sum = 0;
            char[] number = String.valueOf(i).toCharArray();
            for(char c: number){
                sum += factorial(c-48);
            }
            if(sum % i == 0) result += i;
        }
        System.out.println(result);
        
    }
}