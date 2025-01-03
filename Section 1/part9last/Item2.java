
import java.util.Objects;

public class Item2 {

    private String name;
    private int weight;

    public Item2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item2(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + this.weight;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item2 other = (Item2) obj;
        // if (this.weight != other.weight) {
        // return false;
        // }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
