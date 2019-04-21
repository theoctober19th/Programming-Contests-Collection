import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isPalindrome(int num){
		int reversed = 0, original = num;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if(reversed == original) return true;
        else return false;
	}


	public static int largestPalindrome(int num){

		if(num > 906609) return 906609;

		int result=1;
		int max = 0;
		boolean flag=false;
		for(int i=999; i>=100; i--){
			for(int j=999; j>=100; j--){
				if(isPalindrome(i*j) && i*j < num){
					result = i*j;
					max = Math.max(result, max);
				}
			}
	
		}

		return max;

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            System.out.println(largestPalindrome(n));
            
        }
    }
}
