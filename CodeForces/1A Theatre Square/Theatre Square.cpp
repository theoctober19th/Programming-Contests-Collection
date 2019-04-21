/*In this problem, the main pitfall is the choice of variable type. since we may have to store upto 10^9 ,
 we cannot use int, long int or long long signed int.(you can google for maximum value they can hold).
 And the next is the logic.
 */

#include <iostream>
#include <cmath> //For ceil() function.
using namespace std;

int main(){
	long long unsigned m, n, a;
	cin >> m >> n >> a;
	long long unsigned no = ceil(m/(double)a) * ceil(n/(double)a); //ceil function returns an integer that is greater than or equal to the given number.
	cout << no;
	return 0;
}
