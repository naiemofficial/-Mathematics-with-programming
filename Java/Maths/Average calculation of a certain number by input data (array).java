import java.util.Scanner;
import java.util.Arrays;
class averageOfArrayInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        System.out.println("-------------------------\n");

        int[] array = new int[size];
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value of number-"+(i+1)+": ");
            array[i] = input.nextInt();
            sum += array[i];
        }
        sum = sum/array.length;
        System.out.println("\nYour array is: " + Arrays.toString(array));
        System.out.println("Average of numbers = " + sum);
    }
}