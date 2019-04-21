/* written by theoctober19th
25 Aug 2017 */

#include<iostream>
#include<cmath>
using namespace std;
int xc, yc;


int seatRemoteness(int x, int yl, int yr){
    int distance = 0;
    for(int i=yl; i<=yr; i++){
        distance += (abs(x - xc) + abs(i - yc);
    }
    return distance;
}

void findSeatRow(int noOfViewers, int* X, int* YL, int* YR){
    *X = xc;

}



int main(){
    int k, n;
    cin >> n >> k;
    xc = ceil(k/2.0);
    yc = ceil(k/2.0);
    extern int m[n];

    extern bool xyIsEmpty[k][k];
    for(int i=0; i<k; i++){
        for(int j=0; j<k; j++){
            xyIsEmpty[i][j] = true;
        }
    }

    int tempx = xc, tempyl = yc, tempyr yc;

    for(int i=0; i<n; i++){
        cin >> m[i];
        int X, YL, YR;
        findSeatRow(m[i], &X, &YL, &YR);
        if(xyIsEmpty[tempx][tempy1]){
                int distance = seatRemoteness(tempx, tempyl, tempyl+m[i]-1);
            for(int j=0; j<k-m[i]; j++){
                if(seatRemoteness(tempx, j, j+m[i]-1)){

                }
            }
        }

    }
return 0;
}
