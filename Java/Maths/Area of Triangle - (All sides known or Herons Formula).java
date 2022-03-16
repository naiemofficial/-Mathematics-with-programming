import java.util.Scanner;
class triangleHF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        if( (a+b) > c && (b+c) > a && (c+a) > b ){
            double s = (a+b+c)/2;
            double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
            System.out.println("The area of triangle is = " + area);
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}