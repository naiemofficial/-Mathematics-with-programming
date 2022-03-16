import java.util.Scanner;
class sumOfn_conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a postive number: ");
        int n = input.nextInt();
        if( n >= 0){
            int sum = n*(n+1)/2;
            System.out.println( "The sum of nth numbers is = " + sum );
        }else{
            System.out.println("Entered number isn't a positive number");
        }
    }
}