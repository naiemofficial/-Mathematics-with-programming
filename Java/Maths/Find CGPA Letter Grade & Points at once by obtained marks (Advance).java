import java.util.Scanner;
class cgpa_LetterGradePoints_advance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained marks out of 100: ");
        int marks = input.nextInt();

        String grade; double points;
        if(marks > 100){
            grade = "invalid"; points = -1;
        }else if(marks >= 80){
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

        // Advance method used for more validation
        if(points == -1){
            System.out.println("\nInvalid marks. Result not found.");
        }else if(points == 0.00){
            System.out.printf("\nResult Failed \nGrade: %s \nPoints: %.2f", grade, points);
        }else{
            System.out.printf("\nResult Passed \nGrade: %s \nPoints: %.2f", grade, points);
        }
    }
}