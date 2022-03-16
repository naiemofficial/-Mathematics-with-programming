#include <iostream>
using namespace std;

int main(){
    int size;
    cout << "How many number should have the array: ";
    cin >> size;
    int array[size], smallest = 0;
    for (int i = 0; i < sizeof(array)/sizeof(array[0]); i++) {
        cout << "Enter the number-" << (i+1) << ": ";
        cin >> array[i];
        if (i == 0) {
            smallest = array[i];
        } else if (array[i] < smallest) {
            smallest = array[i];
        }
    }
    cout << "\nSmallest number is: " << smallest;
}