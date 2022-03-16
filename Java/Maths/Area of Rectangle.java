import java.util.Scanner;
class rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("The area of rectangle is = " +  area);
    }
}