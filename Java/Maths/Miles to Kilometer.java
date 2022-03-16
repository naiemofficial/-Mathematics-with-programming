import java.util.Scanner;
class miles2Km {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length in Miles: ");
        float M = input.nextFloat();
        float K = M * 1.60934f;

        System.out.printf("Miles in kilometer = %.2f", K);
    }
}