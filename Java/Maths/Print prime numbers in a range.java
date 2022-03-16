import java.util.Scanner;
class primeNumbers {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the beginning number: ");
        int begin = input.nextInt();
        System.out.print("Enter the max nth number: ");
        int max = input.nextInt();
        
        System.out.println("\nPrime numbers are: ");
        boolean flag;
        for (int num = begin; num <= max; num++) {
            flag = true;
            if (num <= 1) {
                flag = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                System.out.print(num + ", ");
            }
        }
    }
}