#include <iostream>
using namespace std;

int main(){
    int num;
    cout << "Enter the number of elements: ";
    cin >> num;

    int term1 = 0, term2 = 1;
    int nextTerm = term1 + term2;
    if(num <= 0){
        cout << "Error! Entered number must be a positive number.";
    }else{
        cout << "\nFibonacci series of " << num << " element(s):";
        for (int i = 1; i <= num; i++) {
            nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
            cout << term1 << ", ";
        }
    }
}