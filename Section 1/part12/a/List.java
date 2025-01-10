package a;

import java.util.Arrays;

public class List<T> {
    private T[] values;
    private int firstEmptyIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.firstEmptyIndex = 0;
    }

    public void add(T newValue) {
        try {
            if (firstEmptyIndex == this.values.length) {
                grow();
            }
            this.values[firstEmptyIndex] = newValue;
            firstEmptyIndex++;

        }
        // catch (IndexOutOfBoundsException e) {
        // System.out.println(e.getMessage() + " -> growing array...");
        // grow();

        // }
        catch (ClassCastException e) {
            System.out.println("Casted types dont match.. only same types accepted for same list");
        }

    }

    public void grow() {
        int size = this.values.length;
        int newSize = size + (size / 2);
        System.out.println("Size = " + size);
        System.out.println("NewSize = " + newSize);
        this.values = (T[]) Arrays.copyOf(this.values, newSize);
    }

    public int size() {
        return this.values.length;
    }

    public T get(int index) {
        return this.values[index];
    }
}
