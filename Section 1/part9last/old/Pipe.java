import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> value;

    public Pipe() {
        this.value = new ArrayList<>();
    }

    public void putIntoPipe(T newValue) {
        this.value.add(newValue);
    }

    public T takeFromPipe() {
        if (this.value.isEmpty() || this.value == null) {
            return null;
        }
        T tempValue = this.value.get(0);
        this.value.remove(0);
        return tempValue;
    }

    public boolean isInPipe() {
        if (this.value.isEmpty() || this.value == null) {
            return false;
        }
        return true;
    }
}
