class largestNumberFromArray_defined {
    public static void main(String args[]) {
        int array[] = { 6, 2, 8, 1, 5 };
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Largest number is: " + largest);
    }
}