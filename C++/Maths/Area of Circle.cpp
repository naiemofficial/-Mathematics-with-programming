#include <iostream>
#include <numbers>
using namespace std;

int main(){
    double radius;
    cout << "Enter the radius of circle: ";
    cin >> radius;

    double area = 3.1416 * radius * radius;
    cout << "The area of circle is = " << area;
}