#include <iostream>
using namespace std;

int main(){
    int x = 5, y = 6, temp = x;
    x = y;
    y = temp;

    cout << "After swap: " << endl;
    cout << "x is = " << x << endl;
    cout << "y is = " << y;
}