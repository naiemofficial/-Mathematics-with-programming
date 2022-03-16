#include <iostream>
using namespace std;

int main(){
    double length, width;
    cout << "Enter the length: ";
    cin >> length;
    cout << "Enter the width: ";
    cin >> width;

    double area = length * width;
    cout << "The area of rectangle is = " << area;
}