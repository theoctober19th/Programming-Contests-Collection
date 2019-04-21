// C++ program to check if given array 
// has 2 elements whose sum is equal 
// to the given value 

// Works only if range elements is limited 
#include <stdio.h> 
#define MAX 65536 

/* Driver program to test above function */
int main() 
{ 
	int n;
	scanf("%d", &n);
	char str[n];
	scanf("%s", str);
	int q;
	scanf("%d", &q);
	for(int j=0; j<q; j++){
		int k;
		scanf("%d", &k);

		int temp; 
		int count = 0;
		bool s[MAX] = {0}; /*initialize hash set as 0*/

		for (int i = 0; i < n; i++) 
		{ 
			temp = k - i; 
			if (temp >= 0 && s[temp] == 1) 
				if(s[i] == s[temp]) count++;
				//printf("Pair with given sum %d is (%d, %d) n", 
				//		k, i, temp); 
			s[i] = 1;
		} 
		printf("                           %d", count); 
	}
	return 0; 
} 
