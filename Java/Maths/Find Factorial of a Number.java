import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        long fact = 1;
        if(num < 0){
            System.out.println("Sorry! Factorial of a negative number doesn't exist.");
        }else{
            for (int i = 1; i <= num; i++) {
               fact = fact * i; 
            }
            System.out.println("Factorial of " + num + " is = " + fact );
        }
    }
}