#include <iostream>
using namespace std;

int main(){
    int rows;
    cout << "Enter the number of rows (1-9): ";
    cin >> rows;

    for (int i = 1; i <= rows; i++) {
        for (int space = rows; (space-i) > 0; space--) {
            cout << " ";
        }
        for (int x = 0; x < i; x++) {
            cout << (x+1) << " ";
        }
        cout << endl;
    }
}