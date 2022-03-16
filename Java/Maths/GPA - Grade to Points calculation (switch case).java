import java.util.Scanner;
class gpa_GradeToPoints_SwitchCase {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained grade: ");
        String grade = input.nextLine();

        double points;
        switch (grade) {
            case "A+":
                points = 5.00;
                break;
            case "A":
                points = 4.00;
                break;
            case "A-":
                points = 3.50;
                break;
            case "B":
                points = 3.00;
                break;
            case "C":
                points = 2.00;
                break;
            case "D":
                points = 1.00;
                break;
            case "F":
                points = 0.00;
                break;
            default:
                points = -1;
                break;
        }

        if(points == -1){
            System.out.println("Invalid grade");
        }else if(points == 0.00){
            System.out.printf("\nResult Failed \nPoints: %.2f", points);
        }else{
            System.out.printf("\nResult Passed \nPoints: %.2f", points);
        }
    }
}