import java.util.Scanner;
class multiplicationTable {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        System.out.println("\nMultiplication table of: " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}