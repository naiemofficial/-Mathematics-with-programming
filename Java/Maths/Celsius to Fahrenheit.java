import java.util.Scanner;
class celsius2Fahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Celsius temperature: ");
        float C = input.nextFloat();
        float F = (C * 1.8f) + 32;

        System.out.printf("Temperature in fahrenheit = %.2f °F", F);
    }
}