#include <bits/stdc++.h>
using namespace std;

int main(){
	int T;
	cin >> T;
	for(int i=0; i<T; i++){
		int S, D;
		cin >> S >> D;
		if(S >= D){
			cout << "YES\n";
		}else{
			cout << "NO\n";
		}
	}
	return 0;
}