import java.util.Scanner;
class average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3 = input.nextInt();

        float sum = (num1 + num2 + num3)/3f;
        System.out.println( "Average of numbers = " + sum );
    }
}