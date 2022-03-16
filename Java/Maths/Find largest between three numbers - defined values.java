class largestNumber_3num_defined {
    public static void main(String args[]){
        int num1 = 5, num2 = 6, num3 = 7;
        if(num1 > num2 && num1 > num3){
            System.out.println("Largest number is: " +  num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Largest number is: " +  num2);
        }else if(num3 > num1 && num3 > num2){
            System.out.println("Largest number is: " +  num3);
        }else{
            System.out.println("Something wrong! Entered 2 largest or more numbers are equal.");
        }
    }
}