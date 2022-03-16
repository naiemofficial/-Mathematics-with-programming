#include <iostream>
using namespace std;

int main(){
    int size;
    cout << "How many numbers are there: ";
    cin >> size;

    int numbers[size];
    for (int i = 0; i < size; i++) {
        cout << "Enter the number-" << (i+1) << ": ";
        cin >> numbers[i];
    }
    int temp = 0;
    for (int i = 0; i < size; i++) {
        for (int x = 0; x < (size-1); x++) {
            if(numbers[x] < numbers[(x+1)]){
                temp = numbers[x];
                numbers[x] = numbers[(x+1)];
                numbers[(x+1)] = temp;
            }
        }
    }

    // Use the below lines to concatenate the full array as a string
    string conc_array = "[";
    for (int i = 0; i < size; i++) {
        conc_array = conc_array.append(to_string(numbers[i]));
        conc_array = (i != size - 1) ? conc_array.append(", ") : conc_array.append("]");
    }
    cout << "\nNumbers are sorted from DSC to ASC: " << endl;
    cout << conc_array;
}