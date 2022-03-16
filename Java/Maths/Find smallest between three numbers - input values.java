import java.util.Scanner;
class smallestNumber_3num_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3 = input.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("Smallest number is: " +  num1);
        }else if(num2 < num1 && num2 < num3){
            System.out.println("Smallest number is: " +  num2);
        }else if(num3 < num1 && num3 < num2){
            System.out.println("Smallest number is: " +  num3);
        }else{
            System.out.println("Something wrong! Entered 2 smallest or more numbers are equal.");
        }
    }
}