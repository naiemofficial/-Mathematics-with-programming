#include <iostream>
using namespace std;

int main(){
    double base, height;
    cout << "Enter the base: ";
    cin >> base;
    cout << "Enter the height: ";
    cin >> height;

    double area = 0.5 * (base * height); // or, area = (base*height)/2
    cout << "The area of triangle is = " << area;
}