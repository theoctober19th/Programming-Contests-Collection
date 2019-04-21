#include <iostream>
#include <cmath>
using namespace std;

const double PHI = (1 + sqrt(5))/2.0;

unsigned long long int fib(int n){
	long double answer = (pow(PHI,n) - pow(-PHI, -n))/sqrt(5);
	return floor(answer);
}

int main(){

	long long int T;
	cin >> T;

	while(T--){
		unsigned long long int n;
		cin >> n;
		unsigned long long int sum = 0;
		unsigned long long int term = 0;

		for(int i=3; true ; i +=3){
			term = fib(i);
			if(term > n)
				break;
			else
				sum += term;
		}
		cout << sum << endl;
	}
	return 0;
}
