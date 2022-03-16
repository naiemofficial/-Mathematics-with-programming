#include <iostream>
using namespace std;

int main(){
    string grade;
    cout << "Enter the obtained grade: ";
    cin >> grade;

    double points;
    if(grade == "A+"){
        points = 5.00;
    }else if(grade == "A"){
        points = 4.00;
    }else if(grade == "A-"){
        points = 3.50;
    }else if(grade == "B"){
        points = 3.00;
    }else if(grade == "C"){
        points = 2.00;
    }else if(grade == "D"){
        points = 1.00;
    }else if(grade == "F"){
        points = 0.00;
    }else{
        points = -1;
    }

    if(points == -1){
        cout << "Invalid grade";
    }else if(points == 0.00){
        printf("\nResult Failed \nPoints: %.2f", points);
    }else{
        printf("\nResult Passed \nPoints: %.2f", points);
    }
}