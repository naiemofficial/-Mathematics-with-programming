#include <iostream>
#include <cmath>
using namespace std;

int main(){
    double a, b, c;
    cout << "Enter the value of a: ";
    cin >> a;
    cout << "Enter the value of b: ";
    cin >> b;
    cout << "Enter the value of c: ";
    cin >> c;

    if( (a+b) > c && (b+c) > a && (c+a) > b ){
        double s = (a+b+c)/2;
        double area = sqrt(s * (s-a) * (s-b) * (s-c));
        cout << "The area of triangle is = " << area;
    } else {
        cout << "Invalid Triangle";
    }
}