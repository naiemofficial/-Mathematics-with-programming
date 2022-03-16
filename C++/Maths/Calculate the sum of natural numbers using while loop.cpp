#include <iostream>
using namespace std;

int main(){
    int n, sum = 0;
    cout << "Enter a positive number: ";
    cin >> n;

    while (n > 0) {
        sum += n;
        n--;
    }
    cout << "The sum of nth numbers is = " << sum;
}