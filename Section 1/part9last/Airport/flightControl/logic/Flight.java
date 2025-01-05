package Airport.flightControl.logic;

public class Flight {
    private Place destinationPlace;
    private Place departurePlace;
    private Airplane airplane;

    public Flight(Airplane airplane, Place departurePlace, Place destinationPlace) {
        this.airplane = airplane;
        this.departurePlace = departurePlace;
        this.destinationPlace = destinationPlace;
    }

    public Place getDestinationPlace() {
        return destinationPlace;
    }

    public Place getDeparturePlace() {
        return departurePlace;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String toString() {
        return this.airplane.toString() + " (" + this.departurePlace + "-" + this.destinationPlace + ")";
    }
}
