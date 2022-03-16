#include <iostream>
using namespace std;

int main(){
    int num;
    cout << "Enter a positive number: ";
    cin >> num;

    bool flag = true;
    if(num <= 1){
        flag = false;
    }else{
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                flag = false;
                break;
            }
        }
    }

    if(flag == true){
        cout << num << " is a prime number";
    }else{
        cout << num << " isn't a prime number";
    }
}