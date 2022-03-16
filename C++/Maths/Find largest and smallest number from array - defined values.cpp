#include <iostream>
using namespace std;

int main(){
    int array[] = { 6, 2, 8, 1, 5 };
    int size = sizeof(array) / sizeof(array[0]);

    int largest = array[0]; 
    int smallest = array[0];
    string conc_array = "[";
    for (int i = 0; i < size; i++) {
        if (array[i] > largest) {
            largest = array[i];
        }
        if (array[i] < smallest) {
            smallest = array[i];
        }

        // Use the below lines to concatenate the full array as a string
        conc_array = conc_array.append(to_string(array[i]));
        conc_array = (i != size - 1) ? conc_array.append(", ") : conc_array.append("]");
    }
    cout << "Your array is: " << conc_array << endl;
    cout << "Largest number is: " << largest << endl;
    cout << "Smallest number is: " << smallest;
}