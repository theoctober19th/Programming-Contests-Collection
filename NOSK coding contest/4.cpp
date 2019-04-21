#include <iostream>
#include <stdio.h>
#define AMIN 1
#define ADIL -1

using namespace std;

int main(){

	int t;
	cin >> t;
	

	for(int i=0; i<t; i++){
		int n;
		cin >> n;
		int winner = AMIN;
		int pile[n];
		for(int j=0; j<n; j++){
			cin >> pile[j];
		}

		for(int j=0; j<n; j++){
			if(pile[j] % 2 == 0){
				winner *= (-1);
				goto out;
			}
		}

		out:
		if(winner = 1){
			cout << "Amin\n";
		}
		else{
			cout << "Adil\n";
		}

	}


return 0;
}