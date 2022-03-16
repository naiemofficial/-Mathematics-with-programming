#include <iostream>
using namespace std;

int main(){
    int array[] = {6, 2, 8, 1, 5};
    int largest = array[0];
    for (int i = 0; i < sizeof(array)/sizeof(array[0]); i++) {
        if (array[i] > largest) {
            largest = array[i];
        }
    }
    cout << "Largest number is: " << largest;
}