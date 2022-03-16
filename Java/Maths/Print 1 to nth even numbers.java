import java.util.Scanner;
class print1toNth_even {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Even numbers are: ");
        for (int i = 1; i <= num; i++) {
            if(i%2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}