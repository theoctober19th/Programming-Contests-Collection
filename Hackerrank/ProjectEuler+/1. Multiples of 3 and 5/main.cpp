#include <iostream>

using namespace std;

long int multiplesOfThree(long int n){
	long int sum=0;
    int a = 3;
    long int N= n%3==0? n/3-1 : n/3;
    long int b = N*3;
    return (N*(a+b))/2;
}

long int multiplesOfFive(long int n){
	long int sum=0;
    int a = 5;
    long int N= n%5==0? n/5-1 : n/5;
    long int b = N*5;
    return (N*(a+b))/2;
}

long int multiplesOfFifteen(long int n){
	long int sum=0;
    int a = 15;
    long int N= n%15==0? n/15-1 : n/15;
    long int b = N*15;
    return (N*(a+b))/2;
}


/*
long int multiplesOfFive(long int n){
	long int sum=0;
    if(n<=5) return 0;
	for(long int i=5; i<n; i=i+5){
		if(i%3 != 0){
			sum += i;
        }
	}
	return sum;
}*/

int main(int argc, char const *argv[])
{
	long int T;
	long int N;
	cin >> T;
	for (long int i = 0; i < T; i++)
	{
		cin >> N;
        long int sum;
		cout << multiplesOfThree(N) + multiplesOfFive(N) - multiplesOfFifteen(N) << endl;

	}
	return 0;
}
