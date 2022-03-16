import java.util.Scanner;
class primeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        
        boolean flag = true;
        if(num <= 1){
            flag = false;
        }else{
            for (int i = 2; i < num; i++) {
                if(num%i == 0){
                    flag = false;
                    break;
                }
            }
        }

        if(flag == true){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " isn't a prime number");
        }
    }
}