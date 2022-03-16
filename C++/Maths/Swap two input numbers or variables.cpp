#include <iostream>
using namespace std;

int main(){
    int x, y;
    cout << "Enter a number for x: ";
    cin >> x;
    cout << "Enter a number for y: ";
    cin >> y;
    
    int temp = x;
    x = y;
    y = temp;

    cout << "\nAfter swap: " << endl;
    cout << "x is = " << x << endl;
    cout << "y is = " << y;
}