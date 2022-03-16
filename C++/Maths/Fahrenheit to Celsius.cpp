#include <iostream>
using namespace std;

int main(){
    float F, C;
    cout << "Enter the Fahrenheit temperature: ";
    cin >> F;
    C = (F-32) / 1.8f;

    printf("Temperature in Celsius = %.2f °C", C);
}