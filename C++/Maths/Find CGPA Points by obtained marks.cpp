#include <iostream>
using namespace std;

int main(){
    int marks;
    cout << "Enter the obtained marks out of 100: ";
    cin >> marks;

    string grade; double points;
    if(marks > 100){
        points = -1;
    }if(marks >= 80){
        points = 4.00;
    }else if(marks >= 75){
        points = 3.75;
    }else if(marks >= 70){
        points = 3.50;
    }else if(marks >= 65){
        points = 3.25;
    }else if(marks >= 60){
        points = 3.00;
    }else if(marks >= 55){
        points = 2.75;
    }else if(marks >= 50){
        points = 2.50;
    }else if(marks >= 45){
        points = 2.25;
    }else if(marks >= 40){
        points = 2.00;
    }else{
        points = 0.00;
    }

    // Advance method used for more validation
    if(points == -1){
        printf("\nInvalid marks. Result not found.");
    }else if(points == 0.00){
        printf("\nResult Failed \nPoints: %.2f", points);
    }else{
        printf("\nResult Passed \nPoints: %.2f", points);
    }
}