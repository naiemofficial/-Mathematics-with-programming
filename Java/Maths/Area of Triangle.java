import java.util.Scanner;
class triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double area = 0.5 * (base * height); // or, area = (base*height)/2 
        System.out.println("The area of triangle is = " +  area);
    }
}