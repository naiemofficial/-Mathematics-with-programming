/* Important note / explaination for beginners:
 * In C/C++ programming allows only integral and enum type value/data in the {switch case} process]
 * As the user input is a string so we can't complete the program as-usual method. Here's the alternative approach below.
 * You must know about ASCII value to understand the program.
 * => The entered value by user passed into conc_ASCII() function that will convert the entered string into characters.
 * => Each character will be converted to an integer and concatenated as a string and finally the value is returned as an integer to fulfill the switch() expression as mentioned above.
 * => case _: must have an integral or enum type constant value, that's why we used ASCII values instead of string to match with the user input.
 */

#include <iostream>
using namespace std;

int conc_ASCII(string value) { // concatenate the ASCII values
    string result;
    for (char ch : value) {
        result = result.append(to_string((int)ch));
    }
    return stoi(result);
};

int main(){
    string grade;
    cout << "Enter the obtained grade: ";
    cin >> grade;
    
    double points;
    switch (conc_ASCII(grade)) {
        case 6543:
            points = 4.00;
            break;
        case 65:
            points = 3.75;
            break;
        case 6545:
            points = 3.50;
            break;
        case 6643:
            points = 3.25;
            break;
        case 66:
            points = 3.00;
            break;
        case 6645:
            points = 2.75;
            break;
        case 6743:
            points = 2.50;
            break;
        case 67:
            points = 2.25;
            break;
        case 68:
            points = 2.00;
            break;
        case 70:
            points = 0.00;
            break;
        default:
            points = -1;
            break;
    }

    if(points == -1){
        cout << "Invalid grade";
    }else if(points == 0.00){
        printf("\nResult Failed \nPoints: %.2f", points);
    }else{
        printf("\nResult Passed \nPoints: %.2f", points);
    }
}