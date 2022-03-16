#include <iostream>
using namespace std;

int main(){
    int marks;
    cout << "Enter the obtained marks out of 100: ";
    cin >> marks;

    string grade; double points;
    if(marks > 100){
        grade = "invalid";
    }else if(marks >= 80){
        grade = "A+";
    }else if(marks >= 75){
        grade = "A";
    }else if(marks >= 70){
        grade = "A-"; 
    }else if(marks >= 65){
        grade = "B+";
    }else if(marks >= 60){
        grade = "B";
    }else if(marks >= 55){
        grade = "B-";
    }else if(marks >= 50){
        grade = "C+";
    }else if(marks >= 45){
        grade = "C";
    }else if(marks >= 40){
        grade = "D";
    }else{
        grade = "F";
    }

    if(grade == "invalid"){
        printf("\nInvalid marks. Result not found.");
    }else if(points == 0.00){
        printf("\nResult Failed \nGrade: %s", grade.c_str());
    }else{
        printf("\nResult Passed \nGrade: %s", grade.c_str());
    }
}