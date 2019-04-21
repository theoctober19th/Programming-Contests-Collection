import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String> nameList = new ArrayList<String>();
		for(int i=0; i<n; i++){
			nameList.add(in.next());
		}
		Collections.sort(nameList);
		int q = in.nextInt();
		for(int i=0; i<q; i++){
			String query = in.next();
			int index = nameList.indexOf(query);
			index++;
			int score = 0;
			for(int j=0; j<query.length(); j++){
				score += query.charAt(j) - 64;
			}
			score *= index;
			System.out.println(score);
		}
	}
}