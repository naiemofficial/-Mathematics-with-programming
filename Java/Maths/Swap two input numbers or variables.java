import java.util.Scanner;
class swapping_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for x: ");
        int x = input.nextInt();
        System.out.print("Enter a number for y: ");
        int y = input.nextInt();

        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("\nAfter swap: ");
        System.out.println("x is = " + x);
        System.out.println("y is = " + y);
            
    }
}