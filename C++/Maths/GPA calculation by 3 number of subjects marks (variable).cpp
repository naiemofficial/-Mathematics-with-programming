#include <iostream>
using namespace std;

float gpa(int marks){
    float points;
    if(marks >= 80){
        points = 5.00;
    }else if(marks >= 70){
        points = 4.00;
    }else if(marks >= 60){
        points = 3.50;
    }else if(marks >= 50){
        points = 3.00;
    }else if(marks >= 40){
        points = 2.00;
    }else if(marks >= 33){
        points = 1.00;
    }else{
        points = 0.00;
    }
    return points;
}

int main(){
    int subject1, subject2, subject3;
    cout << "Enter the obtained marks of subject-1: ";
    cin >> subject1;
    cout << "Enter the obtained marks of subject-2: ";
    cin >> subject2;
    cout << "Enter the obtained marks of subject-3: ";
    cin >> subject3;

    if( (gpa(subject1) == 0 || gpa(subject2) == 0 || gpa(subject3) == 0)){
        printf("\nResult Failed \nPoints: 0.00");
    }else{
        float avg_points = (gpa(subject1)+gpa(subject2)+gpa(subject3)) / 3;
        printf("\nResult Passed \nPoints: %.2f", avg_points);
    }
}