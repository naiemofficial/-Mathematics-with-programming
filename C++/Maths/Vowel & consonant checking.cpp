#include <iostream>
using namespace std;

int main(){
    char ch;
    cout << "Enter a charecter (A-Z): ";
    cin >> ch;

    if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
        if((ch == 'A' || ch == 'a') || (ch == 'E' || ch == 'e') || (ch == 'I' || ch == 'i') || (ch == 'O' || ch == 'o') || (ch == 'U' || ch == 'u')){
            cout << ch <<" is a vowel";
        }else{
            cout << ch << " is a consonant";
        }
    }else{
        cout << "Entered charecter isn't vowel neither consonant";
    }
}