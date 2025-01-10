import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Pipe<String> pipe = new Pipe<>();
        // pipe.putIntoPipe("dibi");
        // pipe.putIntoPipe("dab");
        // pipe.putIntoPipe("dab");
        // pipe.putIntoPipe("daa");
        // while (pipe.isInPipe()) {
        // System.out.println(pipe.takeFromPipe());
        // // }
        // Pipe<Integer> numberPipe = new Pipe<>();
        // numberPipe.putIntoPipe(1);
        // numberPipe.putIntoPipe(2);
        // numberPipe.putIntoPipe(3);

        // int sum = 0;
        // while (numberPipe.isInPipe()) {
        // sum = sum + numberPipe.takeFromPipe();
        // }
        // System.out.println(sum);
        // System.out.println(numberPipe.takeFromPipe());
        // ArrayList<String> strings = new ArrayList<>();
        // strings.add("1");
        // int number = Integer.valueOf(strings.get(0));
        int[] numbers = { 3, -1, 8, 4 };
        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
        int a = numbers.length;
        System.out.println(numbers[a]);
        Pipe<Integer> pipe1 = new Pipe<>();
        Pipe<Integer> pipe2 = new Pipe<>();
        Pipe<Integer>[] pipeArray = new Pipe[] { pipe1, pipe2 };
    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        fromWhere = fromWhere < 0 ? 0 : fromWhere;
        toWhere = toWhere > array.length ? array.length : toWhere;

        for (int i = fromWhere; i < toWhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }
        return sum;
    }
}