#include <iostream>
using namespace std;

int main(){
    int num1, num2, num3;
    cout << "Enter the 1st number: ";
    cin >> num1;
    cout << "Enter the 2nd number: ";
    cin >> num2;
    cout << "Enter the 3rd number: ";
    cin >> num3;

    float sum = (num1 + num2 + num3) / 3;
    cout << "Average of numbers = " << sum;
}