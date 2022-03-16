#include <iostream>
using namespace std;

int main(){
    int size;
    cout << "How many number should have the array: ";
    cin >> size;
    int array[size];

    int largest = 0, smallest = 0;
    string conc_array = "[";
    for (int i = 0; i < size; i++) {
        cout << "Enter the number-" << (i+1) << ": ";
        cin >> array[i];
        if (i == 0) {
            largest = smallest = array[i];
        } else{
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Use the below lines to concatenate the full array as a string
        conc_array = conc_array.append(to_string(array[i]));
        conc_array = (i != size - 1) ? conc_array.append(", ") : conc_array.append("]");
    }
    cout << "\nYour array is: " << conc_array << endl;
    cout << "Largest number is: " << largest << endl;
    cout << "Smallest number is: " << smallest;
}