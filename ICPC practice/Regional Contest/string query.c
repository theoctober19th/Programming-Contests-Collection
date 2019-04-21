#include <stdio.h>
#include <stdlib.h>

int main(){
	int n, q, k, count;
	char s[65536];
	scanf("%d", &n);
	scanf("%s", &s);
	scanf("%d", &q);
	int m, i, j;
	for(i=0; i<q; i++){
		scanf("%d", &k);
		count = 0;

		for(j=0; j<n; j++){
			if(2*i == k){
				count++;
			}
		}

		for(j=0; j<n; j++){
			for(m=0; m<n; m++){
				if(i!=m && s[i] == s[m] && i+m == k){
					count++;
				}
			}
		}
		printf("%d\n", count);
	}
}