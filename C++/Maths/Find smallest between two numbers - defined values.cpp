#include <iostream>
using namespace std;

int main(){
    int num1 = 5, num2 = 6;
    if(num1 < num2){
        cout << "Smallest number is: " << num1;
    }else if(num2 < num1){
        cout << "Smallest number is: " << num2;
    }else{
        cout << "Smallest number not found. Entered numbers are equal.";
    }
}