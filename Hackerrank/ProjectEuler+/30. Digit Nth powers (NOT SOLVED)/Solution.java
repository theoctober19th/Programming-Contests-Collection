/*Fails TestCase 2*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        
        for(int i = (int)Math.pow(10,n-1); i<(int)Math.pow(10,n); i++){
            int sum = 0;
            char[] j = String.valueOf(i).toCharArray();
            for(char c: j){
                int af = c - 48;
                sum += Math.pow(af,n);
            }
            if(sum == i) result += i;
        }
        System.out.println(result);
    }
}