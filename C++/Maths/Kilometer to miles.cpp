#include <iostream>
using namespace std;

int main(){
    float K, M;
    cout << "Enter length in Kilometer: ";
    cin >> K;
    M = K * 0.621371f;

   printf("Kilometer in miles = %.2f", M);
}