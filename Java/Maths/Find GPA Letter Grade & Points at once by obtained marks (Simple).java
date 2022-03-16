import java.util.Scanner;
class gpa_LetterGradePoints_simple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained marks out of 100: ");
        int marks = input.nextInt();

        String grade; double points;
        if(marks >= 80){
            grade = "A+"; points = 5.00;
        }else if(marks >= 70){
            grade = "A"; points = 4.00;
        }else if(marks >= 60){
            grade = "A-"; points = 3.50;
        }else if(marks >= 50){
            grade = "B"; points = 3.00;
        }else if(marks >= 40){
            grade = "C"; points = 2.00;
        }else if(marks >= 33){
            grade = "D"; points = 1.00;
        }else{
            grade = "F"; points = 0.00;
        }
        System.out.printf("\nGrade: %s \nPoints: %.2f", grade, points);
    }
}