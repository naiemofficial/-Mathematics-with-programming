import java.util.Scanner;
class sumOfn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = input.nextInt();
        
        int sum = n*(n+1)/2;
        System.out.println( "The sum of nth numbers is = " + sum );
    }
}