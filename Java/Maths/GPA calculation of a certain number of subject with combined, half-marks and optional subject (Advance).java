import java.util.Scanner;
class gpa_subWithOptional {
    static float gpa(float marks) {
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

    static boolean confirmation(String input){
        if ( input.equals("Y") || input.equals("y") || input.equals("Yes") || input.equals("yes") ) {
            return true;
        }else{
            return false;
        }
    }
    static boolean operation(String input){
        if (input.equals("Y") || input.equals("y") || input.equals("Yes") || input.equals("yes") || input.equals("N") || input.equals("n") || input.equals("No") || input.equals("no") ) {
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("How many subjects are there (without major/optional): ");
        int totalSub = input.nextInt(); input.nextLine();

        // Message
        String invalidOperation = "Error! Invalid operation";
        
        // Combined subject
        int combinedSubjects = 0;
        System.out.print("\nIs there any combined subject(s) (Y=yes & N=no)    : ");
        String comb_conf = input.nextLine();
        if(operation(comb_conf) == false){
            System.out.println(invalidOperation);
        }else{
            if(confirmation(comb_conf) == true){
                System.out.print("How many combined subject(s): ");
                combinedSubjects = input.nextInt(); input.nextLine();
            }

            // Half marks subject
            int halfSubjects = 0;
            System.out.print("\nIs there any half-marks subject(s) (Y=yes & N=no) : ");
            String halfSub_conf = input.nextLine();
            if(operation(halfSub_conf) == false){
                System.out.println(invalidOperation);
            }else{
                if(confirmation(halfSub_conf) == true){
                    System.out.print("How many half-marks subject(s): ");
                    halfSubjects = input.nextInt(); input.nextLine();
                }

                // Optional Subject
                int opt_marks = 0;
                System.out.print("\nIs there any major/optional subject (Y=yes & N=no): ");
                String opt_conf = input.nextLine();
                if(operation(opt_conf) == false){
                    System.out.println(invalidOperation);
                }else{
                    if (combinedSubjects > totalSub || halfSubjects > totalSub) {
                        System.out.println(
                                "Error!!! Combined or Half-marksSubject(s) are can't be more than total subjects");
                    }else{
                        System.out.println("-------------------------\n");
                        int[] subjects = new int[totalSub];
                        float gpa = 0;
                        boolean passed = true;

                        int sub = 1;
                        for (int i = 0; i < subjects.length; i++) {
                            if(combinedSubjects > 0 && combinedSubjects > i){
                                System.out.print((i+1) + " => Enter the obtained marks of combined subject-" + (sub++) + ": ");
                                subjects[i] = input.nextInt();
                            }else if (halfSubjects > 0 && halfSubjects >= subjects.length-i){
                                if (halfSubjects == subjects.length-i) 
                                    sub = 1;
                                System.out.print((i+1) + " => Enter the obtained marks of half-marks subject-" + (sub++) + ": ");
                                subjects[i] = input.nextInt();
                            }else{
                                System.out.print((i+1) + " => Enter the obtained marks of subject SL-" + (i+1) + ": ");
                                subjects[i] = input.nextInt();
                            }
                        }

                        if(confirmation(opt_conf)){
                            System.out.print((subjects.length+1) + " => Enter the obtained marks of optional subject: ");
                            opt_marks = input.nextInt();
                        }

                        for (int i = 0; i < subjects.length; i++) {
                            float marks = 0.00f;
                            if(combinedSubjects > 0 && combinedSubjects > i){
                                marks = subjects[i]/2;
                            }else if(halfSubjects > 0 && halfSubjects >= subjects.length-i){
                                marks = subjects[i]*2;
                            }else{
                                marks = subjects[i];
                            }

                            if(gpa(marks) == 0){
                                passed = false;
                                break;
                            }
                            gpa += gpa(marks);
                        }
                        
                        if(passed == true){
                            float totalGPA = gpa;
                            gpa = gpa / subjects.length;
                            System.out.printf("\nResult Passed \nGPA: %.2f", gpa);
                            if(confirmation(opt_conf) == true && opt_marks > 0){
                                float opt_points = gpa(opt_marks)-2;
                                if (opt_points < 0)
                                    opt_points = 0;
                                totalGPA = (totalGPA + opt_points) / subjects.length;
                                totalGPA = (totalGPA > 5) ? 5.00f : totalGPA;
                                System.out.printf("\nGPA (with optional): %.2f", totalGPA);
                            }                            
                        }else {
                            System.out.printf("\nResult Failed \nPoints: 0.00");
                        }
                    }
                }
            }
        }
    }
}