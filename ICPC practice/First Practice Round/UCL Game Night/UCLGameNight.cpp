#include<iostream>

using namespace std;

int max(int a, int b, int c, int d){
	int m = a;
	int pos = 0;
	if(b > m){
		m = b;
		pos = 1;
	}
	if(c > m){
		m = c;
		pos = 2;
	}
	if(d > m){
		m = d;
		pos = 3;
	}
	return pos
}

int main(){
	int T:
	cin >> T;

	for(int k=0; k<T; k++){
		int N, M, K;
		cin >> N >> M >> K;
		int P[N+1][M+1];
		int rowCount[N+1];
		int colCount[M+1];
		int blackDots = 0;

		int top = 1;
		int bottom = N;
		int left = 1;
		int right = M;

		int length = M;
		int breadth = N;

		for(int i=1; i<=N; i++){
			for(int j=1; j<=M; j++){
				cin >> P[i][j];
				if(P[i][j] == 1){
					rowCount[i]++;
					colCount[j]++;
					blackDots ++;
				}
			}
		}

		while(blackDots > K){
			int mx;
			char remove;
			if(length == breadth)
				mx = max(rowCount[top], rowCount[bottom], colCount[left], colCount[right]);
			else if( length < breadth){
				mx = max(rowCount[top], rowCount[bottom], 0, 0);

				if(mx == 0)
					mx = max(0, 0, colCount[left], colCount[right]);
			}
			else if(breadth < length){
				mx = max(0, 0, colCount[left], colCount[right]);
				if(mx == 0)
					mx = max(rowCount[top], rowCount[bottom], 0, 0);
			}
			switch(mx){
				case 0: 
					top++;
				case 1: bottom--;
				case 2: left++;
				case 3: right--;
				default: left++;
			}
		}
	}
	return 0;
}