import java.util.Scanner;
class smallestNumberFromArray_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("How many number should have the set: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int smallest = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number-"+(i+1)+": ");
            array[i] = input.nextInt();
            if(i==0){
                smallest = array[i];
            }else if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("\nSmallest number is: " + smallest);
    }
}