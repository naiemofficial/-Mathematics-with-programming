import java.util.Scanner;
class armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int temp = num;
        int sum = 0;
        while(temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, 3); // sum += rem * rem * rem
            temp = temp / 10; 
        }
        if(num == sum){
            System.out.println(num + " is an Armstrong number");
        }else{
            System.out.println(num + " isn't an Armstrong number");
        }
    }
}