import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] numbers = {6, 5, 8, 7, 11};
        // System.out.println("Smallest: " + MainProgram.smallest(numbers));
        int[] numbers = { 3, 2, 5, 4, 8 };

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

    }

    public static int smallest(int[] array) {
        int smallest = 9999999;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];

            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = 9999999;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = 999999999;
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int buffer;
        buffer = array[1];
        array[1] = array[2];
        array[2] = buffer;
    }

}
