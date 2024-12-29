import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aaa implements Comparable<Aaa> {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        // Comparable<Integer> comp = new Comparable<Integer>() {
        // public int compareTo(Integer j) {
        // if (this % 10 > j % 10)
        // return 1;
        // else if (this % 10 < j % 10)
        // return -1;
        // else
        // return 0;
        // }

        // };

        nums.add(75);
        nums.add(12);
        nums.add(26);
        nums.add(49);
        nums.add(90);
        nums.add(63);

        Collections.sort(nums, comp);
        System.out.println(nums);

    }

    public int compareTo(Aaa number) {
        if (this > number)
            return 1;

    }
}
