import java.util.Scanner;
import java.util.Arrays;
class ascendingToDescending_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are there: ");
        int size = input.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number-"+(i+1)+": ");
            numbers[i] = input.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int x = 0; x < (numbers.length-1); x++) {
                if(numbers[x] > numbers[(x+1)]){
                    temp = numbers[x];
                    numbers[x] = numbers[(x+1)];
                    numbers[(x+1)] = temp;
                }
            }
        }
        System.out.println("\nNumbers are sorted from ASC to DSC: ");
        System.out.print(Arrays.toString(numbers));
    }
}