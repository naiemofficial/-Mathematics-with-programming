import java.util.Scanner;
class fahrenheit2Celsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Fahrenheit temperature: ");
        float F = input.nextFloat();
        float C = (F-32) / 1.8f;

        System.out.printf("Temperature in Celsius = %.2f °C", C);
    }
}