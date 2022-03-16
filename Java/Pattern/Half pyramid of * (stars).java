import java.util.Scanner;
class halfPyramid_stars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}