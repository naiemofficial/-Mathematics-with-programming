import java.util.Scanner;
class largestNumberFromArray_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("How many number should have the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int largest = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number-"+(i+1)+": ");
            array[i] = input.nextInt();
            if (i == 0) {
                largest = array[i];
            } else if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("\nLargest number is: " + largest);
    }
}