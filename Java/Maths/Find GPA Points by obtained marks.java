import java.util.Scanner;
class gpa_points {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained marks out of 100: ");
        int marks = input.nextInt();

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
            System.out.println("\nInvalid marks. Result not found.");
        }else if(points == 0.00){
            System.out.printf("\nResult Failed \nPoints: %.2f", points);
        }else{
            System.out.printf("\nResult Passed \nPoints: %.2f", points);
        }
    }
}