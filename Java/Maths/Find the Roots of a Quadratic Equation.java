import java.lang.Math;
import java.util.Scanner;
class quadratic {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();

        if(a == 0){
            System.out.println("\nThis isn't Quadratic.");
        }else{
            int d = (b*b) - (4*a*c);
            double x1, x2;
            if(d == 0){
                x1 = -b / (2*a);
                System.out.println("\nRoots are real and same.");
                System.out.println("x1 = x2 = " + x1);
            }else if(d > 0){
                x1 = (-b + Math.sqrt(d)) / (2*a);
                x2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("\nRoots are real and not same");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }else{
                System.out.println("\nRoots are complex/imaginary");
            }
        }
    }
}