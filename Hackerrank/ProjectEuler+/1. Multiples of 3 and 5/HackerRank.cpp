#include <iostream>

using namespace std;

long int naturalSum(long int n){
    return (n*(n+1))/2;
}

int main(){
	long int T;
	long int N;
	cin >> T;
	while(T--){
		cin >> N;
		N--;
		cout << naturalSum(N/3)*3 + naturalSum(N/5)*5 - naturalSum(N/15)*15 << endl;
	}
	return 0;
}