import java.util.Scanner;
class averageOfArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = {15, 20, 30};
        int size = array.length;
        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        sum = sum/size;
        System.out.println( "Average of numbers = " + sum );
    }
}