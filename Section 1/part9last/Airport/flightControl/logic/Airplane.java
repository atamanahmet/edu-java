package Airport.flightControl.logic;

public class Airplane {
    private String ID;
    private int capacity;

    public Airplane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.ID + " (" + this.capacity + ")";
    }

    public String getID() {
        return this.ID;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
