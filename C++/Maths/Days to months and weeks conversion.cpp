#include <iostream>
using namespace std;

int main(){
    int days;
    cout << "Enter the number of days: ";
    cin >> days;

    int months = days / 30;
    int m_days = days % 30;

    int weeks = days / 7;
    int w_days = days % 7;

    cout << months << " month(s) and " << m_days << " day(s)" << endl;
    cout << "or,\n" << weeks << " week(s) and " << w_days << " day(s)";
}