import java.util.Scanner;
class gpa_3sub {
    // Advance method used for more validation
    static float gpa(int marks){
        float points;
        if(marks >= 80){
            points = 5.00f;
        }else if(marks >= 70){
            points = 4.00f;
        }else if(marks >= 60){
            points = 3.50f;
        }else if(marks >= 50){
            points = 3.00f;
        }else if(marks >= 40){
            points = 2.00f;
        }else if(marks >= 33){
            points = 1.00f;
        }else{
            points = 0.00f;
        }
        return points;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained marks of subject-1: ");
        int subject1 = input.nextInt();
        System.out.print("Enter the obtained marks of subject-2: ");
        int subject2 = input.nextInt();
        System.out.print("Enter the obtained marks of subject-3: ");
        int subject3 = input.nextInt();

        if( (gpa(subject1) == 0 || gpa(subject2) == 0 || gpa(subject3) == 0)){
            System.out.printf("\nResult Failed \nPoints: 0.00");
        }else{
            float avg_points = (gpa(subject1)+gpa(subject2)+gpa(subject3)) / 3;
            System.out.printf("\nResult Passed \nPoints: %.2f", avg_points);
        }
    }
}