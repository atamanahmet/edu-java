package HashMapGeneric;

import java.util.Arrays;

public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;

    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
        // int hashValue = Math.abs(key.hashCode() % this.values.length);
        // if (this.values[hashValue] == null) {
        // this.values[hashValue] = new List<>();
        // }
        // int index = -1;
        // List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        // for (int i = 0; i < valuesAtIndex.size(); i++) {
        // if (valuesAtIndex.value(i).getKey().equals(key)) {
        // index = i;
        // break;
        // }
        // }
    }

    public List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }
        return this.values[hashValue];
    }

    public int getIndexOfKey(List<Pair<K, V>> valuesAtIndex, K key) {

        for (int i = 0; i < values.length; i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void grow() {
        List<Pair<K, V>>[] newList = new List[this.values.length * 2];
        for (int i = 0; i < this.firstFreeIndex; i++) {
            copy(newList, i);
        }
        this.values = newList;
    }

    public void copy(List<Pair<K, V>>[] newList, int fromIndex) {
        for (int i = 0; i < this.values[fromIndex].size(); i++) {
            Pair<K, V> pair = this.values[fromIndex].value(i);
            int hashValue = Math.abs(pair.getKey().hashCode() % newList.length);

            // newList[i].add(this.values[fromIndex].value(i));
            if (newList[hashValue] == null) {
                newList[hashValue] = new List<>();
            }
            newList[hashValue].add(pair);
        }
    }
}
