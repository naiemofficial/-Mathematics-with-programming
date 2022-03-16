#include <iostream>
using namespace std;

int main(){
    char data; int rows;
    cout << "Enter a charecter: ";
    cin >> data;
    cout << "Enter the number of rows: ";
    cin >> rows;

    for (int i = 1; i <= rows; i++) {
        for (int x = 0; x < i; x++) {
            cout << data << " ";
        }
        cout << endl;
    }
}