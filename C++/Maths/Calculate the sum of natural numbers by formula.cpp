#include <iostream>
using namespace std;

int main(){
    int n;
    cout << "Enter a postive number: ";
    cin >> n;
    int sum = n*(n+1)/2;
    cout << "The sum of nth numbers is = " << sum;
}