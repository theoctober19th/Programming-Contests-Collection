import java.util.Scanner;


class Solution{

	static Scanner scanner;

	static int getDay(long y, int m, int d){
		long t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		int shift = (m<3) ? 1:0;
		long year = y - (long)shift;
		return (int)( year + year/4 - year/100 + year/400 + t[m-1] + d) % 7; 
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		int t = scanner.nextInt();

		for (int c = 0; c<t; c++){

			long y1 = scanner.nextLong();
			int m1 = scanner.nextInt();
			int d1 = scanner.nextInt();
			long y2 = scanner.nextLong();
			int m2 = scanner.nextInt();
			int d2 = scanner.nextInt();

			int numSundays = 0;

			for(long year = y1; year <= y2; year++){
				for(int month = 1; month <= 12; month++){
					if(getDay(year, month, 1) == 0){
						numSundays ++;
					}
				}
			}


			for(int month = 1; month <= m1 ; month++){
				if(getDay(y1, month, 1) == 0){
					numSundays --;
				}
			}

			for(int month = m2+1; month <=12; month++){
				if(getDay(y2, month, 1) == 0){
					numSundays --;
				}
			}

			if(getDay(y1, m1, d1) == 0){
				numSundays ++;
			}

			System.out.println(numSundays);
		}
	}
}