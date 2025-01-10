package HashMapGeneric;

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

        List<Pair<K, V>> mapList = getListBasedOnKey(key);
        int index = getIndexOfKey(mapList, key);
        if (index < 0) {
            mapList.add(new Pair<>(key, value));
            firstFreeIndex++;
        } else {
            mapList.value(index).setValue(value);
        }
    }

    public List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }
        return this.values[hashValue];
    }

    public int getIndexOfKey(List<Pair<K, V>> mapList, K key) {

        for (int i = 0; i < values.length; i++) {
            if (mapList.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
