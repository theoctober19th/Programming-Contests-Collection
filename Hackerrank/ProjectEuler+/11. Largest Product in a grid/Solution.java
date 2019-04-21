import java.util.Scanner;

public class Solution {
	static int[][] grid = new int[20][20];

	static int up(int i, int j){
		if(i<3) return 0;
		else return grid[i][j]*grid[i-1][j]*grid[i-2][j]*grid[i-3][j];
	}

	static int right(int i, int j){
		if(j>16) return 0;
		else return grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
	}

	static int downright(int i, int j){
		if(i>16 || j>16) return 0;
		else return grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
	}

	static int downleft(int i, int j){
		if(j<3 || i>16) return 0;
		else return grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3];
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        int maxProduct = 0;

        //CODE BEGINS HERE
        for(int i = 0; i<20; i++){
        	for(int j=0; j<20; j++){
        		maxProduct = Math.max(maxProduct, up(i,j));
        		maxProduct = Math.max(maxProduct, right(i,j));
        		maxProduct = Math.max(maxProduct, downleft(i,j));
        		maxProduct = Math.max(maxProduct, downright(i,j));
        	}
        }
        System.out.println(maxProduct);
    }
}
