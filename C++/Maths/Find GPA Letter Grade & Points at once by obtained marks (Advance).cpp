#include <iostream>
using namespace std;

int main(){
    int marks;
    cout << "Enter the obtained marks out of 100: ";
    cin >> marks;

    string grade; double points;
    if(marks > 100){
        grade = "invalid"; points = -1;
    }else if(marks >= 80){
        grade = "A+"; points = 5.00;
    }else if(marks >= 70){
        grade = "A"; points = 4.00;
    }else if(marks >= 60){
        grade = "A-"; points = 3.50;
    }else if(marks >= 50){
        grade = "B"; points = 3.00;
    }else if(marks >= 40){
        grade = "C"; points = 2.00;
    }else if(marks >= 33){
        grade = "D"; points = 1.00;
    }else{
        grade = "F"; points = 0.00;
    }

    if(points == -1){
        printf("\nInvalid marks. Result not found.");
    }else if(points == 0.00){
        printf("\nResult Failed \nGrade: %s \nPoints: %.2f", grade.c_str(), points);
    }else{
        printf("\nResult Passed \nGrade: %s \nPoints: %.2f", grade.c_str(), points);
    }
}