#include <iostream>
using namespace std;

int main(){
    int num;
    cout << "Enter a positive number: ";
    cin >> num;
    cout << "\nMultiplication table of: " << num << endl;
    for (int i = 1; i <= 10; i++) {
        cout << num << " x " << i << " = " << (num*i) << endl;
    }
}