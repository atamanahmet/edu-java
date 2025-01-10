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
        return this.firstEmptyIndex;
    }

    public T get(int index) {
        return this.values[index];
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue == -1) {
            System.out.println("Not Found.");
            return;
        }
        moveToTheLeft(indexOfValue);
        this.firstEmptyIndex--;

    }

    public int indexOfValue(T value) {
        for (int i = 0; i < firstEmptyIndex; i++) {
            if (this.values[i] == value || this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstEmptyIndex; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public T value(int index) {
        if (index < 0 || index >= this.firstEmptyIndex) {
            throw new IndexOutOfBoundsException();
        }
        return this.values[index];
    }
}
