import java.util.Scanner;
class largestNumber_2num_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("Largest number is: " +  num1);
        }else if(num2 > num1){
            System.out.println("Largest number is: " +  num2);
        }else{
            System.out.println("Largest number not found. Entered numbers are equal.");
        }
    }
}