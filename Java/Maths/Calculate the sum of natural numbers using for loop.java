import java.util.Scanner;
class sumOfn_forLoop {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of nth numbers is = " + sum);
    }
}