import java.util.Scanner;
class gpa_PointsToGrade {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the obtained points out of 5.00: ");
        double points = input.nextDouble();

        String grade="";
        if(points > 5.00){
            grade = "invalid";
        }else if(points == 5.00 ){
            grade = "A+";
        }else if(points >= 4.00){
            grade = "A";
        }else if(points >= 3.50){
            grade = "A-";
        }else if(points >= 3.00){
            grade = "B";
        }else if(points >= 2.00){
            grade = "C";
        }else if(points >= 1.00){
            grade = "D";
        }else{
            grade = "F";
        }

        if(grade == "invalid"){
            System.out.println("Invalid points");
        }else if(grade == "F"){
            System.out.println("\nResult Failed \nGrade: " + grade);
        }else{
            System.out.println("\nResult Passed \nGrade: " + grade);
        }
    }
}