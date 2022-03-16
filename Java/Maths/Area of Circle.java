import java.util.Scanner;
class circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius; // or, area = 3.1416 * radius * radius;
        System.out.printf("The area of circle is = %.2f", area);
    }
}