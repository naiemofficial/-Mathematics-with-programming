import java.util.Scanner;
class km2Miles {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length in Kilometer: ");
        float K = input.nextFloat();
        float M = K * 0.621371f;

        System.out.printf("Kilometer in miles = %.2f", M);
    }
}