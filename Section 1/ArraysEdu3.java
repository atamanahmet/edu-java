import java.util.Arrays;

public class ArraysEdu3 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 39, 40, 50 };
        // int[] newarr = arr;
        // newarr[0] = 0;
        // System.out.println(arr[0]);
        // System.out.println(newarr[0]);
        int[] newarr = Arrays.copyOf(arr, arr.length);
        printArray(newarr);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
