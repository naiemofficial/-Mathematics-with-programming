#include <iostream>
using namespace std;

int main(){
    double p, q;
    cout << "Enter the diagonal 1: ";
    cin >> p;
    cout << "Enter the diagonal 2: ";
    cin >> q;

    double area = (p * q) / 2; // or, area = 0.5 * (p * q)
    cout << "The area of rhombus is = " << area;
}