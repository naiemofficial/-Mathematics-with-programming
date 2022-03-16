#include <iostream>
using namespace std;

int main(){
    int begin, max;
    cout << "Enter the beginning number: ";
    cin >> begin;
    cout << "Enter the max nth number: ";
    cin >> max;

    cout << "\nPrime numbers are: " << endl;
    bool flag;
    for (int num = begin; num <= max; num++) {
        flag = true;
        if (num <= 1) {
            flag = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) {
            cout << num << ", ";
        }
    }
}