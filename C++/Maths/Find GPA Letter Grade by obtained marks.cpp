#include <iostream>
using namespace std;

int main(){
    int marks;
    cout << "Enter the obtained marks out of 100: ";
    cin >> marks;

    string grade;
    if(marks > 100){
        grade = "invalid";
    }else if(marks >= 80){
        grade = "A+";
    }else if(marks >= 70){
        grade = "A";
    }else if(marks >= 60){
        grade = "A-";
    }else if(marks >= 50){
        grade = "B";
    }else if(marks >= 40){
        grade = "C";
    }else if(marks >= 33){
        grade = "D";
    }else{
        grade = "F";
    }

    if(grade == "invalid"){
        cout << "\nInvalid marks. Result not found.";
    }else if(grade == "F"){
        cout << "\nResult Failed \nGrade: " << grade;
    }else{
        cout << "\nResult Passed \nGrade: " << grade;
    }
}