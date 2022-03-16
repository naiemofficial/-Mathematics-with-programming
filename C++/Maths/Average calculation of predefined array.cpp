#include <iostream>
using namespace std;

int main(){
    int array[] = {15, 20, 30};
    int size = sizeof(array) / sizeof(array[0]);
    float sum = 0;
    string conc_array = "[";

    for (int i = 0; i < size; i++) {
        sum += array[i];

        // Use the below lines to concatenate the full array as a string
        conc_array = conc_array.append(to_string(array[i]));
        conc_array = (i != size - 1) ? conc_array.append(", ") : conc_array.append("]");
    }
    sum = sum/size;
    cout << "\nYour array is: " << conc_array << endl;
    cout << "Average of numbers = " << sum;
}