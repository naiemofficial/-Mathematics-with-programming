#include <iostream>
using namespace std;

int main(){
    int size;
    cout << "How many number should have the array: ";
    cin >> size;
    int array[size], largest = 0;
    for (int i = 0; i < sizeof(array)/sizeof(array[0]); i++) {
        cout << "Enter the number-" << (i+1) << ": ";
        cin >> array[i];
        if (i == 0) {
            largest = array[i];
        } else if (array[i] > largest) {
            largest = array[i];
        }
    }
    cout << "\nLargest number is: " << largest;
}