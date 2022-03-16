import java.util.Scanner;
class square {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of square: ");
        int s = input.nextInt();
        double area = Math.pow(s, 2); // or, area = s * s
        System.out.println("The area of square is = " +  area);
    }
}