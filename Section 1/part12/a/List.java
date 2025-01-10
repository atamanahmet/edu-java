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
        T[] bufferArray = (T[]) new Object[newSize];
        // System.out.println("Size = " + size);
        // System.out.println("NewSize = " + newSize);
        // this.values = (T[]) Arrays.copyOf(this.values, newSize);
        for (int i = 0; i < values.length; i++) {
            bufferArray[i] = this.values[i];
        }
        this.values = bufferArray;
    }

    public int size() {
        return this.values.length;
    }

    public T get(int index) {
        return this.values[index];
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.firstEmptyIndex; i++) {
            if (this.values[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(T value) {
        boolean isDone = false;
        for (int i = 0; i < this.firstEmptyIndex; i++) {
            if (this.values[i] == value || this.values[i].equals(value)) {
                this.values[i] = null;
                isDone = true;
                for (int j = i; j < this.firstEmptyIndex; j++) {
                    this.values[j] = this.values[j + 1];

                }
            }
            if (isDone) {
                break;
            }
        }
    }
}
