#include <iostream>
#include <cmath>
using namespace std;

int main(){
    double radius;
    cout << "Enter the radius of sphere: ";
    cin >> radius;
    
    double area = 4 * 3.1416 *  pow(radius, 2);
    double volume = (4/3) * 3.1416 * pow(radius, 3);
    double diameter = 2 * radius;

    printf("\nThe area of sphere is = %.2f", area);
    printf("\nThe volume of sphere is = %.2f", volume);
    printf("\nThe diameter of sphere is = %.2f", diameter);
}