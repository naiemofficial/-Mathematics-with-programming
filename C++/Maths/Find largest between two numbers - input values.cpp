#include <iostream>
using namespace std;

int main(){
    int num1, num2;
    cout << "Enter the 1st number: ";
    cin >> num1;
    cout << "Enter the 2nd number: ";
    cin >> num2;

    if(num1 > num2){
        cout << "Largest number is: " << num1;
    }else if(num2 > num1){
        cout << "Largest number is: " << num2;
    }else{
        cout << "Largest number not found. Entered numbers are equal.";
    }
}