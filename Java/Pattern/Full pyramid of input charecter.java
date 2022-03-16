import java.util.Scanner;
class fullPyramid_inputCh {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a charecter: ");
        char data = input.next().charAt(0);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int space = rows; (space-i) > 0; space--) {
                System.out.print(" ");
            }
            for (int x = 0; x < i; x++) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}