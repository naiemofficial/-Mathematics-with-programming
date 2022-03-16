#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int temp = num, sum = 0;
     while(temp != 0) {
        int rem = temp % 10;
        sum += pow(rem, 3); // sum += rem * rem * rem
        temp = temp / 10; 
    }
    if(num == sum){
        cout << num << " is an Armstrong number";
    }else{
        cout << num << " isn't an Armstrong number";
    }
}