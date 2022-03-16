import java.util.Scanner;
class fibonacci_nthTerms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        int term1 = 0, term2 = 1;
        int nextTerm = term1 + term2;
        if(num <= 0){
            System.out.println("Error! Entered number must be a positive number.");
        }else{
            System.out.println("\nFibonacci series to " + num + "th term(s):");
            while (nextTerm <= num) {
                nextTerm = term1 + term2;
                term1 = term2;
                term2 = nextTerm;
                System.out.print(term1 + ", ");
            }
        }
    }
}