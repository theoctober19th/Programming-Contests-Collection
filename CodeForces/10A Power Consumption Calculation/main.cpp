#include <iostream>
using namespace std;

int main(){
    short int n, p1, p2, p3, t1, t2;
    cin >> n >> p1 >> p2 >> p3 >> t1 >> t2;
    short int l[n],r[n];
    long int power = 0;
    int timeWithLaptop, timeWithoutLaptop = 0, sleepTime = 0, screenSaverTime = 0;
    for(int i=0; i<n; i++){
        cin >> l[i] >> r[i];
        timeWithLaptop = r[i] -l[i];
        timeWithoutLaptop = 0; sleepTime = 0; screenSaverTime = 0;

        if(i==0){
            sleepTime = 0;
            screenSaverTime = 0;
        }

        else{
            timeWithoutLaptop = l[i] - r[i-1];

            if(timeWithoutLaptop < t1){
                timeWithLaptop += timeWithoutLaptop;
                screenSaverTime = 0;
                sleepTime = 0;
            }
            else{
                timeWithLaptop += t1;
                screenSaverTime = timeWithoutLaptop - t1;
                if(screenSaverTime < t2){
                    sleepTime = 0;
                } else{
                    sleepTime = screenSaverTime - t2;
                    screenSaverTime = t2;
                }
            }
        }
        power += timeWithLaptop * p1 + screenSaverTime * p2 + sleepTime * p3;
    }
    cout << power;
return 0;
}
