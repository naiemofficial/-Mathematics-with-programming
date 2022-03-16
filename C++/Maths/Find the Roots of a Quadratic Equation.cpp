#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int a, b, c;
    cout << "Enter the value of a: ";
    cin >> a;
    cout << "Enter the value of b: ";
    cin >> b;
    cout << "Enter the value of c: ";
    cin >> c;

    if(a == 0){
        cout << "\nThis isn't Quadratic.";
    }else{
        int d = (b*b) - (4*a*c);
        double x1, x2;
        if(d == 0){
            x1 = -b / (2*a);
            cout << "\nRoots are real and same." << endl;
            cout << "x1 = x2 = " << x1;
        }else if(d > 0){
            x1 = (-b + sqrt(d)) / (2*a);
            x2 = (-b - sqrt(d)) / (2*a);
            cout << "\nRoots are real and not same" << endl;
            cout << "x1 = " << x1 << endl;
            cout << "x2 = " << x2;
        }else{
            cout << "\nRoots are complex/imaginary";
        }
    }
}