
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();

    }

    public void add(String unit, String item) {
        if (this.facility.containsKey(unit)) {
            this.facility.get(unit).add(item);
        } else {
            this.facility.put(unit, new ArrayList<>());
            this.facility.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String unit) {
        if (this.facility.containsKey(unit)) {
            return this.facility.get(unit);
        } else {
            this.facility.put(unit, new ArrayList<>());
            return this.facility.get(unit);
        }
    }

    public void remove(String unit, String item) {
        if (this.facility.containsKey(unit)) {
            this.facility.get(unit).remove(item);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsThatNotEmpty = new ArrayList<>();
        for (String unit : this.facility.keySet()) {
            if (!this.facility.get(unit).isEmpty()) {
                unitsThatNotEmpty.add(unit);
            }
        }
        return unitsThatNotEmpty;
    }
}
