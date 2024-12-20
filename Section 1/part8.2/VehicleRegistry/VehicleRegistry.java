
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate license, String owner) {
        if (registry.get(license) != null) {
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
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : registry.values()) {
            if (!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }

    public boolean search(LicensePlate license) {
        if (registry.get(license) != null) {
            return true;
        }
        return false;
    }
}
