import java.util.Scanner;
class sphere {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        double radius = input.nextDouble();

        double area = 4d * Math.PI * Math.pow(radius, 2); // or, area = 4d * 3.1416 * radius * radius
        double volume = (4d/3d) * Math.PI * Math.pow(radius, 3); // or, volume = (4d/3d) * 3.1416 * radius * radius * radius
        double diameter = 2 * radius;
        // => "d" with number (4d/3d) represent the double data type. If you're using float, then use "f" with number instead of "d" e.g. (4f/3f)

        System.out.printf("\nThe area of sphere is = %.2f", area);
        System.out.printf("\nThe volume of sphere is = %.2f", volume);
        System.out.printf("\nThe diameter of sphere is = %.2f", diameter);
    }
}