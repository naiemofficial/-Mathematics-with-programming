#include <iostream>
using namespace std;

int main(){
    double points;
    cout << "Enter the obtained grade: ";
    cin >> points;

    string grade = "";
    if(points > 4.00){
        grade = "invalid";
    }else if(points == 4.00 ){
        grade = "A+";
    }else if(points >= 3.75){
        grade = "A";
    }else if(points >= 3.50){
        grade = "A-";
    }else if(points >= 3.25){
        grade = "B+";
    }else if(points >= 3.00){
        grade = "B";
    }else if(points >= 2.75){
        grade = "B-";
    }else if(points >= 2.50){
        grade = "C+";
    }else if(points >= 2.25){
        grade = "C";
    }else if(points >= 2.00){
        grade = "D";
    }else{
        grade = "F";
    }

    if(grade == "invalid"){
        cout << "\nInvalid points;";
    }else if(grade == "F"){
        cout << "\nResult Failed \nGrade: " << grade;
    }else{
        cout << "\nResult Passed \nGrade: " << grade;
    }
}