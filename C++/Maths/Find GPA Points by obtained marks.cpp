#include <iostream>
using namespace std;

int main(){
    int marks;
    cout << "Enter the obtained marks out of 100: ";
    cin >> marks;

    double points;
    if(marks > 100){
        points = -1;
    }else if(marks >= 80){
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

    if(points == -1){
        cout << "\nInvalid marks. Result not found.";
    }else if(points == 0.00){
        printf("\nResult Failed \nPoints: %.2f", points);
    }else{
        printf("\nResult Passed \nPoints: %.2f", points);
    }
}