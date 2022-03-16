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
bool confirmation(string input){
    if ( input == "Y" || input == "y" || input == "Yes" || input == "yes" ) {
        return true;
    }else{
        return false;
    }
}
bool operation(string input){
    if (input == "Y" || input == "y" || input == "Yes" || input == "yes" || input == "N" || input == "n" || input == "No" || input == "no" ) {
        return true;
    }else{
        return false;
    }
}

int main(){
    int totalSub;
    cout << "How many subjects are there (without major/optional): ";
    cin >> totalSub;

    // Message
    string invalidOperation = "Error! Invalid operation";
    
    // Combind subject
    int combindSubjects = 0; string comb_conf;
    cout << "\nIs there any combind subject(s) (Y=yes & N=no)    : ";
    cin >> comb_conf;
    if(operation(comb_conf) == false){
        cout << invalidOperation;
    }else{
        if(confirmation(comb_conf) == true){
            cout << "How many combind subject(s): ";
            cin >> combindSubjects;
        }

        // Half marks subject
        int halfSubjects = 0; string halfSub_conf;
        cout << "\nIs there any half-marks subject(s) (Y=yes & N=no) : ";
        cin >> halfSub_conf;
        if(operation(halfSub_conf) == false){
            cout << invalidOperation;
        }else{
            if(confirmation(halfSub_conf) == true){
                cout << "How many half-marks subject(s): ";
                cin >> halfSubjects;
            }

            // Optional Subject
            int opt_marks = 0; string opt_conf;
            cout << "\nIs there any major/optional subject (Y=yes & N=no): ";
            cin >> opt_conf;
            if(operation(opt_conf) == false){
                cout << invalidOperation;
            }else{
                if (combindSubjects > totalSub || halfSubjects > totalSub) {
                    cout << "Error!!! Combind or Half-marksSubject(s) are can't be more than total subjects";
                }else{
                    cout << "-------------------------\n" << endl;
                    int subjects[totalSub];
                    float gpa_s = 0; bool passed = true;

                    int sub = 1;
                    for (int i = 0; i < totalSub; i++) {
                        if(combindSubjects > 0 && combindSubjects > i){
                            cout << (i+1) << " => Enter the obtained marks of combind subject-" << (sub++) << ": ";
                            cin >> subjects[i];
                        }else if (halfSubjects > 0 && halfSubjects >= totalSub-i){
                            if (halfSubjects == totalSub-i) 
                                sub = 1;
                            cout << (i+1) << " => Enter the obtained marks of half-marks subject-" << (sub++) << ": ";
                            cin >> subjects[i];
                        }else{
                            cout << (i+1) << " => Enter the obtained marks of subject SL-" << (i+1) << ": ";
                            cin >> subjects[i];
                        }
                    }

                    if(confirmation(opt_conf)){
                        cout << (totalSub + 1) << " => Enter the obtained marks of optional subject: ";
                        cin >> opt_marks;
                    }

                    for (int i = 0; i < totalSub; i++) {
                        float marks = 0.00;
                        if(combindSubjects > 0 && combindSubjects > i){
                            marks = subjects[i]/2;
                        }else if(halfSubjects > 0 && halfSubjects >= totalSub-i){
                            marks = subjects[i]*2;
                        }else{
                            marks = subjects[i];
                        }

                        if(gpa(marks) == 0){
                            passed = false;
                            break;
                        }
                        gpa_s += gpa(marks);
                    }

                    if(passed == true){
                        float totalGPA = gpa_s;
                        gpa_s = gpa_s / totalSub;
                        printf("\nResult Passed \nGPA: %.2f", gpa_s);
                        if(confirmation(opt_conf) == true && opt_marks > 0){
                            float opt_points = gpa(opt_marks)-2;
                            if (opt_points < 0)
                                opt_points = 0;
                            totalGPA = (totalGPA + opt_points) / totalSub;
                            totalGPA = (totalGPA > 5) ? 5.00f : totalGPA;
                            printf("\nGPA (with optional): %.2f", totalGPA);
                        }                            
                    }else {
                        printf("\nResult Failed \nPoints: 0.00");
                    }
                }
            }
        }
    }
}