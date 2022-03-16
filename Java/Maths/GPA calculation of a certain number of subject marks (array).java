import java.util.Scanner;
class gpa_certainSub {
    static float gpa(int marks) {
        float points;
        if (marks >= 80) {
            points = 5.00f;
        } else if (marks >= 70) {
            points = 4.00f;
        } else if (marks >= 60) {
            points = 3.50f;
        } else if (marks >= 50) {
            points = 3.00f;
        } else if (marks >= 40) {
            points = 2.00f;
        } else if (marks >= 33) {
            points = 1.00f;
        } else {
            points = 0.00f;
        }
        return points;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("How many subjects are there: ");
        int totalSub = input.nextInt();
        System.out.println("-------------------------\n");

        int[] subjects = new int[totalSub];
        float gpa = 0; boolean passed = true;
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter the obtained marks of subject-"+(i+1)+": ");
            subjects[i] = input.nextInt();
            gpa = gpa + gpa(subjects[i]);
        }
        for (int i = 0; i < subjects.length; i++) {
            if(gpa(subjects[i]) == 0){
                passed = false;
                break;
            }
        }
        if(passed == true){
            gpa = gpa / subjects.length;
            System.out.printf("\nResult Passed \nPoints: %.2f", gpa);
        }else{
            System.out.printf("\nResult Failed \nPoints: 0.00");
        }
    }
}