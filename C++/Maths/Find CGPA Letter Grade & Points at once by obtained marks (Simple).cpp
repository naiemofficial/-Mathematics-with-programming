#include <iostream>
using namespace std;

int main(){
    int marks;
    cout << "Enter the obtained marks out of 100: ";
    cin >> marks;

    string grade; double points;
    if(marks >= 80){
        grade = "A+"; points = 4.00;
    }else if(marks >= 75){
        grade = "A"; points = 3.75;
    }else if(marks >= 70){
        grade = "A-";  points = 3.50;
    }else if(marks >= 65){
        grade = "B+"; points = 3.25;
    }else if(marks >= 60){
        grade = "B"; points = 3.00;
    }else if(marks >= 55){
        grade = "B-"; points = 2.75;
    }else if(marks >= 50){
        grade = "C+"; points = 2.50;
    }else if(marks >= 45){
        grade = "C"; points = 2.25;
    }else if(marks >= 40){
        grade = "D"; points = 2.00;
    }else{
        grade = "F"; points = 0.00;
    }
    printf("\nGrade: %s \nPoints: %.2f", grade.c_str(), points);
}