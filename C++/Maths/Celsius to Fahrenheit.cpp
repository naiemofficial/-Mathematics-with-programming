#include <iostream>
using namespace std;

int main(){
    float C, F;
    cout << "Enter the Celsius temperature: ";
    cin >> C;
    F = (C * 1.8f) + 32;

    printf("Temperature in fahrenheit = %.2f °F", F);
}