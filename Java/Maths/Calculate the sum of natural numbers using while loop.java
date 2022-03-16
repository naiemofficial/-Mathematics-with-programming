import java.util.Scanner;
class sumOfn_whileLoop {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = input.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("The sum of nth numbers is = " + sum);
    }
}