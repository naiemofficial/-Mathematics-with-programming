#include <iostream>
using namespace std;

int main(){
    float M, K;
    cout << "Enter length in Miles: ";
    cin >> M;
    K = M * 1.60934f;

    printf("Miles in kilometer = %.2f", K);
}