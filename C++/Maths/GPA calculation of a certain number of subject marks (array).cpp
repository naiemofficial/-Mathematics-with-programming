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
    int totalSub;
    cout << "How many subjects are there: ";
    cin >> totalSub;
    cout << "-------------------------\n";

    int subjects[totalSub];
    float total_gpa = 0; bool passed = true;
    for (int i = 0; i < totalSub; i++) {
        cout << "Enter the obtained marks of subject-" << (i+1) << ": ";
        cin >> subjects[i];
        total_gpa = total_gpa + gpa(subjects[i]);
    }
    for (int i = 0; i < totalSub; i++) {
        if(gpa(subjects[i]) == 0){
            passed = false;
            break;
        }
    }

    if(passed == true){
        total_gpa = total_gpa / totalSub;
        printf("\nResult Passed \nPoints: %.2f", total_gpa);
    }else{
        printf("\nResult Failed \nPoints: 0.00");
    }
}