import java.util.Scanner;
class gpaLetterGrade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained marks out of 100: ");
        int marks = input.nextInt();

        String grade;
        if(marks > 100){
            grade = "invalid";
        }else if(marks >= 80){
            grade = "A+";
        }else if(marks >= 70){
            grade = "A";
        }else if(marks >= 60){
            grade = "A-";
        }else if(marks >= 50){
            grade = "B";
        }else if(marks >= 40){
            grade = "C";
        }else if(marks >= 33){
            grade = "D";
        }else{
            grade = "F";
        }

        if(grade == "invalid"){
            System.out.println("\nInvalid marks. Result not found.");
        }else if(grade == "F"){
            System.out.println("\nResult Failed \nGrade: " + grade);
        }else{
            System.out.println("\nResult Passed \nGrade: " + grade);
        }
    }
}