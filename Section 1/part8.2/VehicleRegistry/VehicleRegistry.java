
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate license, String owner) {
        if (this.registry.containsKey(license)) {
            return false;
        } else {
            this.registry.put(license, owner);
            return true;
        }
    }

    public String get(LicensePlate license) {
        if (this.registry.containsKey(license)) {
            return this.registry.get(license);
        } else {
            return null;
        }
    }

    public boolean remove(LicensePlate license) {
        if (this.registry.containsKey(license)) {
            this.registry.remove(license);
            return true;
        } else {
            return false;
        }
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

}
