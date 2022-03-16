#include <iostream>
using namespace std;

int main(){
    int n;
    cout << "Enter a postive number: ";
    cin >> n;
    if( n >= 0){
        int sum = n*(n+1)/2;
        cout <<  "The sum of nth numbers is = " << sum;
    }else{
        cout << "Entered number isn't a positive number";
    }
}