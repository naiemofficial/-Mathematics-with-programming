import java.util.Arrays;
class ascendingToDescending_predefined {
    public static void main(String args[]){
        int numbers[] = {6, -1, 7, -5, 15, 3, 5, 20, -8, 12};
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int x = 0; x < (numbers.length-1); x++) {
                if(numbers[x] > numbers[(x+1)]){
                    temp = numbers[x];
                    numbers[x] = numbers[(x+1)];
                    numbers[(x+1)] = temp;
                }
            }
        }
        System.out.println("\nNumbers are sorted from ASC to DSC: ");
        System.out.print(Arrays.toString(numbers));
    }
}