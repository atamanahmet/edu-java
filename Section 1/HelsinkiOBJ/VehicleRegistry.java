
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate license, String owner) {
        if (registry.get(license).equals(owner)) {
            return false;
        }
        registry.put(license, owner);
        return true;
    }

    public String get(LicensePlate license) {
        return this.get(license);
    }

    public boolean remove(LicensePlate license) {
        if (registry.get(license) != null) {
            this.remove(license);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate item : registry.keySet()) {
            System.out.println(item);
        }
    }
}
