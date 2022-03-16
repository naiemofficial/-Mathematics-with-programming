class largestNumber_2num_defined {
    public static void main(String args[]){
        int num1 = 5, num2 = 6;
        if(num1 > num2){
            System.out.println("Largest number is: " +  num1);
        }else if(num2 > num1){
            System.out.println("Largest number is: " +  num2);
        }else{
            System.out.println("Largest number not found. Entered numbers are equal.");
        }
    }
}