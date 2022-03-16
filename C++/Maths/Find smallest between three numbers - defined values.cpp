#include <iostream>
using namespace std;

int main(){
    int num1 = 5, num2 = 6, num3 = 7;

    if(num1 < num2 && num1 < num3){
        cout << "Smallest number is: " << num1;
    }else if(num2 < num1 && num2 < num3){
        cout << "Smallest number is: " << num2;
    }else if(num3 < num1 && num3 < num2){
        cout << "Smallest number is: " << num3;
    }else{
        cout << "Something wrong! Entered 2 smallest or more numbers are equal.";
    }
}