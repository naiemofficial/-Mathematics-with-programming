import java.util.Scanner;
class positiveNagetive {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num + " is a postive number");
        } else if (num < 0) {
            System.out.println(num + " is a nagetive number");
        } else {
            System.out.println("Zero (0) isn't a positive neither nagetive number.");
        }
    }
}