import java.util.Scanner;
class rhombus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diagonal 1: ");
        double p = input.nextDouble();
        System.out.print("Enter the diagonal 2: ");
        double q = input.nextDouble();

        double area = (p * q) / 2; // or, area = 0.5 * (p * q)
        System.out.println("The area of rhombus is = " +  area);
    }
}