import java.util.Scanner;
class cgpa_GradeToPoints {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained grade: ");
        String grade = input.nextLine();

        double points;
        if(grade.equals("A+")){
            points = 4.00;
        }else if(grade.equals("A")){
            points = 3.75;
        }else if(grade.equals("A-")){
            points = 3.50;
        }else if(grade.equals("B+")){
            points = 3.25;
        }else if(grade.equals("B")){
            points = 3.00;
        }else if(grade.equals("B-")){
            points = 2.75;
        }else if(grade.equals("C+")){
            points = 2.50;
        }else if(grade.equals("C")){
            points = 2.25;
        }else if(grade.equals("D")){
            points = 2.00;
        }else if(grade.equals("F")){
            points = 0.00;
        }else{
            points = -1;
        }

        if(points == -1){
            System.out.println("\nInvalid grade");
        }else if(points == 0.00){
            System.out.println("\nResult Failed \nPoints: " + points);
        }else{
            System.out.println("\nResult Passed \nPoints: " + points);
        }
    }
}