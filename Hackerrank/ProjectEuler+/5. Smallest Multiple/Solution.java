import java.util.*;

public class Solution {

	static int gcd(int a, int b){
		if(a%b == 0) return b;
		else return(gcd(b, a%b));
	}

    static int lcm(int n){
		int ans=1;
		for(int i=1; i<=n; i++){
			ans = (ans * i) / gcd(ans, i);
		}
		return ans;
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            System.out.println(lcm(n));
        }
    }
}
