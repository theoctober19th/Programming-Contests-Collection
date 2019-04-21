#include <iostream>
#include <stdio.h>

#define PI 3.142857142857143

using namespace std;

int main(){
	float radius;
	cin >> radius;

	float squareArea = 4*radius*radius;
	float circleArea = PI * radius * radius;
	float result = squareArea-circleArea;

	printf("%.2f\n", result); //truncatethis to only two decimal placces

	return 0;

}