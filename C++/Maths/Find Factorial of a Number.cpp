#include <iostream>
using namespace std;

int main(){
    int num;
    cout << "Enter a positive number: ";
    cin >> num;

    long fact = 1;
    if(num < 0){
        cout << "Sorry! Factorial of a negative number doesn't exist.";
    }else{
        for (int i = 1; i <= num; i++) {
            fact = fact * i; 
        }
        cout << "Factorial of " << num << " is = " << fact;
    }
}