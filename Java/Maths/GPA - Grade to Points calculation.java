import java.util.Scanner;
class gpa_GradeToPoints {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained grade: ");
        String grade = input.nextLine();

        double points;
        if(grade.equals("A+")){
            points = 5.00;
        }else if(grade.equals("A")){
            points = 4.00;
        }else if(grade.equals("A-")){
            points = 3.50;
        }else if(grade.equals("B")){
            points = 3.00;
        }else if(grade.equals("C")){
            points = 2.00;
        }else if(grade.equals("D")){
            points = 1.00;
        }else if(grade.equals("F")){
            points = 0.00;
        }else{
            points = -1;
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