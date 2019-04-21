//The Coffee Coders
//10-oct-2018

#include <bits/stdc++.h> 
using namespace std; 
  
// Utility function to find 
// GCD of 'a' and 'b' 
int getgcd(int a, int b) { 
    if (b == 0) 
        return a; 
    return getgcd(b, a % b); 
} 

int getlcm(int a, int b){
    return (a*b)/getgcd(a,b);
}

  
// Returns LCM of array elements 
int findlcm(int arr[], int n) 
{ 
    // Initialize result 
    int ans = arr[0]; 
  
    // ans contains LCM of arr[0], ..arr[i] 
    // after i'th iteration, 
    for (int i = 1; i < n; i++) 
        ans = getlcm(ans, arr[i]);
    return ans; 
}

bool contains(int arr[], int n, int key){
    for(int i=0; i<n; i++){
        if(arr[i] == key) return true;
    }
    return false;
}

// Driver Code 
int main() { 
    int n;
    cin >> n;
    int arr[n];
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }

    int lcm = findlcm(arr, n);
    int count = 0;

    // Note that this loop runs till square root 
    for (int i=1; i<=sqrt(lcm); i++) { 
        if (lcm%i == 0) { 
            // If divisors are equal, count them as single factor
            if (lcm/i == i){
                if(!contains(arr, n, i)) count++;
            }
            else {// Otherwise count both
                if(!contains(arr, n, i)) count++;
                if(!contains(arr, n, lcm/i)) count++;
            }
        }
    } 

    printf("%d %d", lcm, count); 
    return 0; 
}