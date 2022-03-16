#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int s;
    cout << "Enter the side length of square: ";
    cin >> s;
    double area = pow(s, 2); // or, area = s * s
    cout << "The area of square is = " << area;
}