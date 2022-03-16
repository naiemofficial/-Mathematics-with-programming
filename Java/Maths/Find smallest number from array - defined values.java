class smallestNumberFromArray_defined {
    public static void main(String args[]) {
        int array[] = { 6, 2, 8, 1, 5 };
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
    }
}