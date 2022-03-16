import java.util.Scanner;
import java.util.Arrays;
class largestSmallestNumberFromArray_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("How many number should have the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int largest = 0, smallest = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number-"+(i+1)+": ");
            array[i] = input.nextInt();
            if (i == 0) {
                largest = smallest = array[i];
            } else{
                if (array[i] > largest) {
                    largest = array[i];
                }
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }
        }
        System.out.println("\nYour array is: " + Arrays.toString(array));
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
}